package com.pessoas.service;

import java.util.List;

import com.pessoas.entity.Desenvolvedor;

public interface DesenvolvedorService {

	void cadastrarDesenvolvedor(Desenvolvedor desenvolvedor);
	
	Desenvolvedor listarDesenvolvedorId(Integer id);
	
	List<Desenvolvedor>listarTodosDesenvolvedor();
	
}
