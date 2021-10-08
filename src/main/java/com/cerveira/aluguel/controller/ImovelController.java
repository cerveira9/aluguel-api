package com.cerveira.aluguel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cerveira.aluguel.model.Imovel;
import com.cerveira.aluguel.repository.ImovelRepository;

@RestController
@RequestMapping("/imovel")
public class ImovelController {
	
	@Autowired
	private ImovelRepository imovelRepository;
	
	@GetMapping
	public List<Imovel> retornaImoveis( ) {
		return imovelRepository.findAll();
	}
	
	@PostMapping("/save")
	public Imovel salvaImovel(@RequestBody Imovel imovel) {
		imovelRepository.save(imovel);
		return imovel;
	}
}
