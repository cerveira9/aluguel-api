package com.cerveira.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cerveira.aluguel.model.Aluguel;

public interface AluguelRepository extends JpaRepository<Aluguel, Long>{

}
