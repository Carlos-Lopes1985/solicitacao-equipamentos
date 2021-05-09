package com.zup.solicitacaoequipamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zup.solicitacaoequipamentos.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
	Usuario findByEmailAndSenha(String email, String senha);
	
	@Query("SELECT u FROM Usuario u WHERE u.email = ?1 AND u.senha = ?2")
	public Usuario logar(String email, String senha);
	
}
