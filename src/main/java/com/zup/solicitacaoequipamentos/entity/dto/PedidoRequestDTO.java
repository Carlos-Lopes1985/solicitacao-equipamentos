package com.zup.solicitacaoequipamentos.entity.dto;

public class PedidoRequestDTO {

	private String descricao;
	private String assunto;
	private Long idUsuario;
	private String descricaoAndamento;
	private Long idPedido;
	
	public PedidoRequestDTO(String descricao, String assunto, Long idUsuario, String descricaoAndamento,
			Long idPedido) {
		super();
		this.descricao = descricao;
		this.assunto = assunto;
		this.idUsuario = idUsuario;
		this.descricaoAndamento = descricaoAndamento;
		this.idPedido = idPedido;
	}

	public PedidoRequestDTO(String descricao, String assunto, Long idUsuario) {
		super();
		this.descricao = descricao;
		this.assunto = assunto;
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

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDescricaoAndamento() {
		return descricaoAndamento;
	}

	public void setDescricaoAndamento(String descricaoAndamento) {
		this.descricaoAndamento = descricaoAndamento;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	
}
