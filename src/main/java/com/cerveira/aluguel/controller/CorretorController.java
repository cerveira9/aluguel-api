package com.cerveira.aluguel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cerveira.aluguel.model.Corretor;
import com.cerveira.aluguel.repository.CorretorRepository;

@RestController
@RequestMapping("/corretor")
public class CorretorController {
	
	@Autowired
	private CorretorRepository corretorRepository;
	
	@GetMapping
	public List<Corretor> retornaCorretores( ) {
		return corretorRepository.findAll();
	}
	
	@PostMapping("/save")
	public Corretor salvaCorretor(@RequestBody Corretor corretor) {
		corretorRepository.save(corretor);
		return corretor;
	}

}
