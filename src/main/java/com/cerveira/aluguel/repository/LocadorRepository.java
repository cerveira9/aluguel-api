package com.cerveira.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cerveira.aluguel.model.Locador;

@Repository
public interface LocadorRepository extends JpaRepository<Locador, Long>{

}
