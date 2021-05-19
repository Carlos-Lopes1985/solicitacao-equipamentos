package com.pessoas.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.pessoas.enums.Perfil;

@Entity
@JsonTypeName("desenvolvedor")
public class Desenvolvedor extends Funcionario implements Serializable{

	@ManyToOne
	@JoinColumn(name="equipe_id")
	private Equipe equipe;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Desenvolvedor(Integer idUsuario, String nome, LocalDate dataNascimento, String cpf, String senha, String email, String matricula, LocalDate dataEntrada) {
		super(idUsuario, nome, dataNascimento, cpf, senha, email, matricula, dataEntrada);
		addPerfil(Perfil.CLIENTE);
	}
	
	public Desenvolvedor(Integer idUsuario, String nome, LocalDate dataNascimento, String cpf, String senha,
			String email, String matricula, LocalDate dataEntrada, Equipe equipe) {
		super(idUsuario, nome, dataNascimento, cpf, senha, email, matricula, dataEntrada);
		this.equipe = equipe;
	}



	public Desenvolvedor() {
		super();
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
}
