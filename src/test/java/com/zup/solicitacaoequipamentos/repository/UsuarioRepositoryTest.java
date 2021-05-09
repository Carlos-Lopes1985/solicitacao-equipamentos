package com.zup.solicitacaoequipamentos.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zup.solicitacaoequipamentos.entity.Usuario;
import com.zup.solicitacaoequipamentos.enums.Role;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsuarioRepositoryTest {
	
	private static Usuario usu;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Before
	public void setup() {
		 usu = new Usuario(null, "Kelvin", "123", "kelvin@hotmail.com", Role.ADMINISTRADOR);
	}
	
	@Test
	public void Asave() {
		Usuario usuario = usuarioRepository.save(usu);
		assertThat(usuario.getId()).isEqualTo(1L);
	}
	
	@Test
	public void update() {
		usu.setId(1L);
		usu.setNome("Kelvin Angels");
		Usuario usuario = usuarioRepository.save(usu);
		assertThat(usuario.getNome()).isEqualTo("Kelvin Angels");
	}
	
	@Test
	public void getByIdTest() {
		
		Optional<Usuario> result = usuarioRepository.findById(1L);
		
		Usuario user = result.get();
		
		assertThat(user.getSenha()).isEqualTo("123");
	}
	
	@Test
	public void listUsuarioTest() {
		List<Usuario>users = usuarioRepository.findAll();
		assertThat(users.size() == 1);
	}
	
	@Test
	public void logarUsuarioTest() {
		
		Usuario usu = usuarioRepository.findByEmailAndSenha("kelvin@hotmail.com", "123");
		
		assertThat(usu != null);
	}
}
