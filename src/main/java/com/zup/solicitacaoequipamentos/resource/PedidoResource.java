package com.zup.solicitacaoequipamentos.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.solicitacaoequipamentos.entity.Pedido;
import com.zup.solicitacaoequipamentos.entity.dto.PedidoDTO;
import com.zup.solicitacaoequipamentos.service.PedidosService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

	@Autowired
	private PedidosService pedidoService;
	
	@PostMapping
	public ResponseEntity<Pedido>cadastrarUsuario(@RequestBody @Valid PedidoDTO ped){
		return ResponseEntity.ok().body(pedidoService.cadastrarPedido(ped));
	}
}
