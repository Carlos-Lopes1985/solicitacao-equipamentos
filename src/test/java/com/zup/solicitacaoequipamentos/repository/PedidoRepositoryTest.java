package com.zup.solicitacaoequipamentos.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
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

import com.zup.solicitacaoequipamentos.entity.Pedido;
import com.zup.solicitacaoequipamentos.entity.Usuario;
import com.zup.solicitacaoequipamentos.enums.Role;
import com.zup.solicitacaoequipamentos.enums.StatusPedido;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PedidoRepositoryTest {
	
	private static Pedido ped;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Before
	public void setup() {
//		Usuario usu = new Usuario();
//		usu.setId(1L);
//		
//		ped = new Pedido(null, "Novo Laptop", "Pretendo obter um laptop", LocalDate.now(), StatusPedido.ABERTO, usu, null);
	}
	
	@Test
	public void Asave() {
		Usuario usu = new Usuario();
		usu = new Usuario(1L, "Kelvin", "123", "kelvin@hotmail.com", Role.ADMINISTRADOR);
		
		usuarioRepository.save(usu);
		ped = new Pedido(null, "Novo Laptop", "Pretendo obter um laptop", LocalDate.now(), StatusPedido.ABERTO, usu, null);
		
		Pedido pedido = pedidoRepository.save(ped);
		assertThat(pedido.getId()).isEqualTo(1L);
	}
	
	@Test
	public void update() {
		ped.setId(1L);
		ped.setDescricao("Preciso de um novo laptop");
		
		Pedido pedido = pedidoRepository.save(ped);
		assertThat(pedido.getDescricao()).isEqualTo("Preciso de um novo laptop");
		
	}
	
	@Test
	public void getByIdTest() {
		
		Optional<Pedido> result = pedidoRepository.findById(1L);
		
		Pedido ped = result.get();
		
		assertThat(ped.getId()).isEqualTo(1L);
	}
	
	@Test
	public void listPedidoTest() {
		List<Pedido>peds = pedidoRepository.findAll();
		assertThat(peds.size() == 1);
	}
}
