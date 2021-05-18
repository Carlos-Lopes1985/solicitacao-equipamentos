package com.pessoas.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("gestor")
public class Gestor extends Funcionario{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Gestor(Integer idUsuario, String nome, LocalDate dataNascimento, String cpf, String senha, String email,
			String matricula, LocalDate dataEntrada, Equipe equipe) {
		super(idUsuario, nome, dataNascimento, cpf, senha, email, matricula, dataEntrada);
		this.equipe = equipe;
	}

	@OneToOne(mappedBy = "gestor")
	private Equipe equipe;

	public Gestor() {
		super();
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
}
