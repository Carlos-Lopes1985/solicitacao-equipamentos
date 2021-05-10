package com.zup.solicitacaoequipamentos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.solicitacaoequipamentos.entity.Usuario;
import com.zup.solicitacaoequipamentos.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<Usuario>cadastrarUsuario(@RequestBody Usuario usu){
		
		return ResponseEntity.ok().body(usuarioService.salvar(usu));
	}
	
	@GetMapping
	public ResponseEntity<List<Usuario>>buscarTodosUsuario(){
		
		return ResponseEntity.ok().body(usuarioService.buscarTodos());
	}
}
