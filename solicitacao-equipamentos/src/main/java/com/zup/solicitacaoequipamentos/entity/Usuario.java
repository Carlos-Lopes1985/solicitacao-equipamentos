package com.zup.solicitacaoequipamentos.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zup.solicitacaoequipamentos.enums.Role;

@Entity
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 75)
	private String nome;
	
	@Column(nullable = false, length = 100)
	private String senha;
	
	@Column(nullable = false, length = 75, unique = true)
	private String email;
	
	@Column(nullable = false, length = 20)
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Pedido>pedidos = new ArrayList<Pedido>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<AndamentoPedido> status = new ArrayList<AndamentoPedido>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Equipamento>equipamentos = new ArrayList<Equipamento>();
	
	public Usuario(String nome, String senha, String email,Role role) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.role = role;
	}

	public Usuario() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Usuario(Long id, String nome, String senha, String email, Role role) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.role = role;
	}

	public List<AndamentoPedido> getStatus() {
		return status;
	}

	public void setStatus(List<AndamentoPedido> status) {
		this.status = status;
	}
	

}
	
