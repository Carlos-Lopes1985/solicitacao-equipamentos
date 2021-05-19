package com.pessoas.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Salario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double valor;
	private LocalDate dataSalario;
	private String cargoNivel;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;

	public Salario() {
		super();
	}

	public Salario(Long id, Double valor, LocalDate dataSalario, String cargoNivel, Pessoa pessoa) {
		super();
		this.id = id;
		this.valor = valor;
		this.dataSalario = dataSalario;
		this.cargoNivel = cargoNivel;
		this.pessoa = pessoa;
	}

	public Salario(Long id, Double valor, LocalDate dataSalario, String cargoNivel) {
		super();
		this.id = id;
		this.valor = valor;
		this.dataSalario = dataSalario;
		this.cargoNivel = cargoNivel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getDataSalario() {
		return dataSalario;
	}

	public void setDataSalario(LocalDate dataSalario) {
		this.dataSalario = dataSalario;
	}

	public String getCargoNivel() {
		return cargoNivel;
	}

	public void setCargoNivel(String cargoNivel) {
		this.cargoNivel = cargoNivel;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
