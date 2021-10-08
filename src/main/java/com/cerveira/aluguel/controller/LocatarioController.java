package com.cerveira.aluguel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cerveira.aluguel.model.Locatario;
import com.cerveira.aluguel.repository.LocatarioRepository;

@RestController
@RequestMapping("/locatario")
public class LocatarioController {

	@Autowired
	private LocatarioRepository locatarioRepository;
	
	@GetMapping
	public List<Locatario> retornaLocatarios( ) {
		return locatarioRepository.findAll();
	}
	
	@PostMapping("/save")
	public Locatario salvaLocatario(@RequestBody Locatario locatario) {
		locatarioRepository.save(locatario);
		return locatario;
	}
}
