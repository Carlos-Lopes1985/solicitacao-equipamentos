package com.pessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoas.entity.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

}
