package com.cerveira.aluguel.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Entity
@Service
public class Imovel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String endereco;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private TipoImovelEnum tipoImovel;
	
	@ManyToOne
	@JoinColumn(name = "id_aluguel")
	private Aluguel aluguel;
	
}
