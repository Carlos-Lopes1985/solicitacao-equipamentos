package com.zup.solicitacaoequipamentos.entity.dto;

public class PedidoDTO {

	private String descricao;
	private String assunto;
//	private LocalDate data;
//	private StatusPedido statusPedido;
	private Long idUsuario;
	
	public PedidoDTO(String descricao, String assunto, Long idUsuario) {
		super();
		this.descricao = descricao;
		this.assunto = assunto;
	//	this.data = data;
	//	this.statusPedido = statusPedido;
		this.idUsuario = idUsuario;
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

//	public LocalDate getData() {
//		return data;
//	}
//
//	public void setData(LocalDate data) {
//		this.data = data;
//	}

//	public StatusPedido getStatusPedido() {
//		return statusPedido;
//	}
//
//	public void setStatusPedido(StatusPedido statusPedido) {
//		this.statusPedido = statusPedido;
//	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
