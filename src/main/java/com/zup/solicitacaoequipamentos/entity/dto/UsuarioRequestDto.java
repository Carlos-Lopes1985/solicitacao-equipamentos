package com.zup.solicitacaoequipamentos.entity.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.zup.solicitacaoequipamentos.enums.Role;

public class UsuarioRequestDto {
	
	@NotBlank(message = "Name é obrigatório")
	private String nome;
	
	@NotBlank(message = "senha é obrigatório")
	private String senha;
	
	private Role role;
	
	@Email
	@NotBlank(message = "email é obrigatório")
	private String email;

	

	public UsuarioRequestDto(@NotBlank(message = "Name é obrigatório") String nome,
			@NotBlank(message = "senha é obrigatório") String senha,
			 Role role,
			@Email @NotBlank(message = "email é obrigatório") String email) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.role = role;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
