package com.pessoas.service;

import java.util.List;

import com.pessoas.entity.Desenvolvedor;

public interface ClienteService {

	void cadatrarCliente(Desenvolvedor cliente);
	
	Desenvolvedor listarClienteId(Integer id);
	
	List<Desenvolvedor>listarTodosClientes();
	
}
