package com.zup.solicitacaoequipamentos.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zup.solicitacaoequipamentos.enums.StatusPedido;

@Entity
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String descricao;
	@Column(nullable = false, length = 75)
	private String assunto;
	private LocalDate data;

	@Column(nullable = false, length = 75)
	@Enumerated(EnumType.STRING)
	private StatusPedido statusPedido;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
	private List<AndamentoPedido>andamentoPedidos = new ArrayList<AndamentoPedido>();
	
	public Pedido(Long id, String descricao, String assunto, LocalDate data, StatusPedido statusPedido,
			Usuario usuario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.assunto = assunto;
		this.data = data;
		this.statusPedido = statusPedido;
		this.usuario = usuario;
	}

	public Pedido(Long id, String descricao, String assunto, LocalDate data) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.assunto = assunto;
		this.data = data;
	}

	public Pedido() {
		super();
	}
	
	public Pedido(Long id, String descricao, String assunto, LocalDate data, StatusPedido statusPedido, Usuario usuario,
			List<AndamentoPedido> andamentoPedidos) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.assunto = assunto;
		this.data = data;
		this.statusPedido = statusPedido;
		this.usuario = usuario;
		this.andamentoPedidos = andamentoPedidos;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", descricao=" + descricao + ", assunto=" + assunto + ", data=" + data + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

//	public List<AndamentoPedido> getAndamentoPedidos() {
//		return andamentoPedidos;
//	}
//
//	public void setAndamentoPedidos(List<AndamentoPedido> andamentoPedidos) {
//		this.andamentoPedidos = andamentoPedidos;
//	}

}
