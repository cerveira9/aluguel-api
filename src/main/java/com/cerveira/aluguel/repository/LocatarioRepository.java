package com.cerveira.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cerveira.aluguel.model.Locatario;

@Repository
public interface LocatarioRepository extends JpaRepository<Locatario, Long>{

}

