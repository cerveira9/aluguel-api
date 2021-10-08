package com.cerveira.aluguel.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Aluguel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private int dataVencimento;
	private double valor;
	
	@ManyToOne
	@JoinColumn(name = "id_locador")
	private Locador locador;
	
	@ManyToOne
	@JoinColumn(name = "id_corretor")
	private Corretor corretor;
	
	@ManyToOne
	@JoinColumn(name = "id_imovel")
	private Imovel imovel;
	
	@ManyToOne
	@JoinColumn(name = "id_locatario")
	private Locatario locatario;


}
