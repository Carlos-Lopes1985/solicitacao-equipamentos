package com.zup.solicitacaoequipamentos.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zup.solicitacaoequipamentos.entity.Pedido;
import com.zup.solicitacaoequipamentos.entity.Usuario;
import com.zup.solicitacaoequipamentos.entity.dto.PedidoDTO;
import com.zup.solicitacaoequipamentos.enums.StatusPedido;
import com.zup.solicitacaoequipamentos.repository.AndamentoPedidoRepository;
import com.zup.solicitacaoequipamentos.repository.PedidoRepository;

@Service
public class PedidosService {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private AndamentoPedidoRepository andamentoPedidoRepository;
	
	public Pedido cadastrarPedido(PedidoDTO pedido) {
		
		Pedido pedidoObj = convertFromDto(pedido);
		
		return pedidoRepository.save(pedidoObj);
	}
	
	
	public Pedido convertFromDto(PedidoDTO pedido) {
		
		Pedido pedidoObj = new Pedido(null, pedido.getDescricao(), pedido.getAssunto(), LocalDate.now());
		pedidoObj.setStatusPedido(StatusPedido.ABERTO);
		
		Usuario usu = new Usuario();
		
		usu.setId(pedido.getIdUsuario());
		pedidoObj.setUsuario(usu);
		
		return pedidoObj;
	}
	
}
