package com.zup.solicitacaoequipamentos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zup.solicitacaoequipamentos.entity.Usuario;
import com.zup.solicitacaoequipamentos.repository.UsuarioRepository;
import com.zup.solicitacaoequipamentos.util.HashUtil;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario salvar(Usuario usu) {
		
		String hash = HashUtil.getSecurityHash(usu.getSenha());
		usu.setSenha(hash);
		
		return usuarioRepository.save(usu);
	}
	
	public Usuario update(Usuario usu) {
		
		String hash = HashUtil.getSecurityHash(usu.getSenha());
		usu.setSenha(hash);
		
		Usuario usuUpdate = usuarioRepository.save(usu);
		
		return usuUpdate;
	}
	
	public Usuario buscarPorId(Long id) {
		Optional<Usuario>user =  usuarioRepository.findById(id);
		return user.get();
	}
	
	public List<Usuario>buscarTodos(){
		List<Usuario>usuarios = usuarioRepository.findAll();
		return usuarios;
	}
	
	public Usuario login(String email, String senha) {
		
		senha = HashUtil.getSecurityHash(senha);
		
		return usuarioRepository.logar(email, senha);
	}
}
