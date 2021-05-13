package com.zup.solicitacaoequipamentos;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.zup.solicitacaoequipamentos.entity.AndamentoPedido;
import com.zup.solicitacaoequipamentos.entity.Pedido;
import com.zup.solicitacaoequipamentos.entity.Usuario;
import com.zup.solicitacaoequipamentos.enums.Role;
import com.zup.solicitacaoequipamentos.enums.StatusPedido;
import com.zup.solicitacaoequipamentos.repository.AndamentoPedidoRepository;
import com.zup.solicitacaoequipamentos.repository.PedidoRepository;
import com.zup.solicitacaoequipamentos.repository.UsuarioRepository;

@SpringBootApplication
public class SolicitacaoEquipamentosApplication extends SpringBootServletInitializer implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private AndamentoPedidoRepository andamentoRepository;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SolicitacaoEquipamentosApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SolicitacaoEquipamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usu = new Usuario(null, "Carlos", "123", "carloshotmail.com", Role.USUARIO);
		Usuario usu1= new Usuario(null, "Pedro", "123", "pedro@.com", Role.USUARIO);
		
		usuarioRepository.saveAll(Arrays.asList(usu,usu1));
		
		Pedido pedido  = new Pedido(null, "Mouse", "Solicito um mouse", LocalDate.now(),StatusPedido.ABERTO, usu);
		Pedido pedido2 = new Pedido(null, "Mouse", "Solicito um mouse", LocalDate.now(),StatusPedido.FECHADO, usu1);
		
		pedidoRepository.saveAll(Arrays.asList(pedido,pedido2));
		
		AndamentoPedido andamentoPedido = new AndamentoPedido(null, "Solicitação aceita", LocalDate.now(), StatusPedido.EMANDAMENTO, pedido2, usu);
		AndamentoPedido andamentoPedido2 = new AndamentoPedido(null,"em processo de compra", LocalDate.now(), StatusPedido.EMANDAMENTO, pedido, usu1);
		
		andamentoRepository.saveAll(Arrays.asList(andamentoPedido,andamentoPedido2));
	}

}
