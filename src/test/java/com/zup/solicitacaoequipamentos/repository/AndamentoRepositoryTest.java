package com.zup.solicitacaoequipamentos.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zup.solicitacaoequipamentos.entity.AndamentoPedido;
import com.zup.solicitacaoequipamentos.entity.Pedido;
import com.zup.solicitacaoequipamentos.entity.Usuario;
import com.zup.solicitacaoequipamentos.enums.Role;
import com.zup.solicitacaoequipamentos.enums.StatusPedido;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AndamentoRepositoryTest {

	@Autowired
	private AndamentoPedidoRepository andamentoPedidoRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Test
	public void AsaveTest() {
		
		Usuario usu = new Usuario(null, "Kelvin", "123", "kelvin@hotmail.com", Role.ADMINISTRADOR);
		
		Usuario user = usuarioRepository.save(usu);
		
		Pedido ped = new Pedido(null, "Novo Laptop", "Pretendo obter um laptop", LocalDate.now(), StatusPedido.ABERTO, user, null);
		
		Pedido pedido = pedidoRepository.save(ped);
		
		AndamentoPedido andamentoPedido = new AndamentoPedido(1L, "Foi comprado um noot com 16 gb", LocalDate.now(), StatusPedido.EMANDAMENTO, pedido, user);
		
		andamentoPedidoRepository.save(andamentoPedido);
		
		assertThat(andamentoPedido.getDescricao()).isEqualTo("Foi comprado um noot com 16 gb");
		
	}

	@Test
	public void getByIdTest() {
		
		Optional<AndamentoPedido> result = andamentoPedidoRepository.findById(2L);
		
		AndamentoPedido andamento = result.get();
		
		assertThat(andamento.getDescricao()).isEqualTo("Foi comprado um noot com 16 gb");
	}
	
	@Test
	public void listByPedidoIdTest() {
		
		List<AndamentoPedido> result = andamentoPedidoRepository.findAllByPedidoId(1L);
		
		assertThat(result.size()).isEqualTo(1);
	}
	
	@Test
	public void listByAndamentoTest() {
		
		List<AndamentoPedido>andamentos = andamentoPedidoRepository.findAll();
		
		assertThat(andamentos.size()).isEqualTo(1);
	}
}
