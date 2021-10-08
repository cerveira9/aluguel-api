package com.cerveira.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cerveira.aluguel.model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long>{

}
