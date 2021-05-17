package com.zup.almoxarifado.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.zup.solicitacaoequipamentos.entity.Usuario;
	
	@Entity
	public class Equipamento implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		private String nome;
		private String serial;
		private Double preco;
		private LocalDate dataEntrega;
		private LocalDate dataDevolucao;
		
		private Long IdUsuario;
		
		public Equipamento() {
			super();
		}

		public Equipamento(Long id, String nome, String serial, Double preco, LocalDate dataEntrega,
				LocalDate dataDevolucao) {
			super();
			this.id = id;
			this.nome = nome;
			this.serial = serial;
			this.preco = preco;
			this.dataEntrega = dataEntrega;
			this.dataDevolucao = dataDevolucao;
		}

		public Equipamento(Long id, String nome, String serial, Double preco, LocalDate dataEntrega,
				LocalDate dataDevolucao, Usuario usuario) {
			super();
			this.id = id;
			this.nome = nome;
			this.serial = serial;
			this.preco = preco;
			this.dataEntrega = dataEntrega;
			this.dataDevolucao = dataDevolucao;
			this.usuario = usuario;
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
		public String getSerial() {
			return serial;
		}
		public void setSerial(String serial) {
			this.serial = serial;
		}
		public Double getPreco() {
			return preco;
		}
		public void setPreco(Double preco) {
			this.preco = preco;
		}
		public LocalDate getDataEntrega() {
			return dataEntrega;
		}
		public void setDataEntrega(LocalDate dataEntrega) {
			this.dataEntrega = dataEntrega;
		}
		public LocalDate getDataDevolucao() {
			return dataDevolucao;
		}
		public void setDataDevolucao(LocalDate dataDevolucao) {
			this.dataDevolucao = dataDevolucao;
		}

		public Usuario getUsuario() {
			return usuario;
		}

		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
	}
	
}
