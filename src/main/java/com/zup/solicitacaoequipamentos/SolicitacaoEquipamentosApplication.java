package com.zup.solicitacaoequipamentos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zup.solicitacaoequipamentos.entity.Usuario;
import com.zup.solicitacaoequipamentos.enums.Role;
import com.zup.solicitacaoequipamentos.repository.UsuarioRepository;

@SpringBootApplication
public class SolicitacaoEquipamentosApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SolicitacaoEquipamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario usu = new Usuario(null, "Bruno", "123", "bruno@hotmail.com", Role.USUARIO);
		Usuario usu2 = new Usuario(null, "Carlos", "123", "carlos@hotmail.com", Role.USUARIO);
	
		usuarioRepository.saveAll(Arrays.asList(usu, usu2));
	}

}
