package com.pessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.pessoas.entity.Pessoa;

@Service
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
