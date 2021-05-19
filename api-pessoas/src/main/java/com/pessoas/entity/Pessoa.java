package com.pessoas.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.pessoas.enums.Perfil;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type") //mapeamento com herança, cria umatabela para cada entidade
public abstract class Pessoa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer   idPessoa;
	private String    nome;
	private LocalDate dataNascimento;
	private String    cpf;
	private String    senha;
	@Column(unique=true)
	private String    email;
	
	@JsonIgnore
	@OneToOne(mappedBy = "pessoa")
	private Salario salarios;
	
//	@ElementCollection(fetch = FetchType.EAGER)
//	@CollectionTable(name="TELEFONES")
//	private Set<String> telefones = new HashSet<>();
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="PERFIS")
	private Set<Integer> perfis = new HashSet<>();
	
	public Pessoa() {
		super();
	}

	public Pessoa(Integer idUsuario, String nome, LocalDate dataNascimento, String cpf, String senha, String email) {
		super();
		this.idPessoa = idUsuario;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.senha = senha;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idPessoa + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf="
				+ cpf + ", getClass()=" + getClass() + "Senha="+ senha + ", toString()=" + super.toString()
				+ "]";
	}

	public Integer getIdUsuario() {
		return idPessoa;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idPessoa = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

//	public Set<String> getTelefones() {
//		return telefones;
//	}
//
//	public void setTelefones(Set<String> telefones) {
//		this.telefones = telefones;
//	}
	
	//responsável por retornar todos os perfils do usuário
	public Set<Perfil> getPerfils(){
		return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
		
	}
	
	public void addPerfil(Perfil perfil) {
		perfis.add(perfil.getCod());
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Salario getSalarios() {
		return salarios;
	}

	public void setSalarios(Salario salarios) {
		this.salarios = salarios;
	}

	public Set<Integer> getPerfis() {
		return perfis;
	}

	public void setPerfis(Set<Integer> perfis) {
		this.perfis = perfis;
	}
}
