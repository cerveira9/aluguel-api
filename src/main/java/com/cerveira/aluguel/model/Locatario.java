package com.cerveira.aluguel.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Entity
@Service
public class Locatario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	private String cpf;
	private String rg;
	private String orgaoEmissor;
	private String endereco;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;

}
