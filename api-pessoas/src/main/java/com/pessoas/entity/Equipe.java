package com.pessoas.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Equipe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeEquipe;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "gestor_id")
	private Gestor gestor;
	
	@JsonIgnore
	@OneToMany(mappedBy = "equipe")
	private List<Desenvolvedor> devs = new ArrayList<Desenvolvedor>();
	
	
	public Equipe(Long id, String nomeEquipe) {
		super();
		this.id = id;
		this.nomeEquipe = nomeEquipe;
	}

	public Equipe(Long id, String nomeEquipe, List<Desenvolvedor> devs) {
		super();
		this.id = id;
		this.nomeEquipe = nomeEquipe;
		this.devs = devs;
	}

	public Equipe(Long id, String nomeEquipe, Gestor gestor) {
		super();
		this.id = id;
		this.nomeEquipe = nomeEquipe;
		this.gestor = gestor;
	}

	public Equipe(Long id, String nomeEquipe, Gestor gestor, List<Desenvolvedor> devs) {
		super();
		this.id = id;
		this.nomeEquipe = nomeEquipe;
		this.gestor = gestor;
		this.devs = devs;
	}

	public Equipe() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEquipe() {
		return nomeEquipe;
	}

	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}

	public List<Desenvolvedor> getDevs() {
		return devs;
	}

	public void setDevs(List<Desenvolvedor> devs) {
		this.devs = devs;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Pessoa gestor) {
		this.gestor = (Gestor) gestor;
	}
	
}
