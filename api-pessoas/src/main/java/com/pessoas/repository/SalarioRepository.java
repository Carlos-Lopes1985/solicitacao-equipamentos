package com.pessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoas.entity.Salario;

@Repository
public interface SalarioRepository extends JpaRepository<Salario, Long> {

}
