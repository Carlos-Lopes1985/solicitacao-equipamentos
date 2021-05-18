package com.pessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoas.entity.Desenvolvedor;

@Repository
public interface ClienteRepository extends JpaRepository<Desenvolvedor, Integer> {

}
