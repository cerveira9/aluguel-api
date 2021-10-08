package com.cerveira.aluguel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cerveira.aluguel.model.Locador;
import com.cerveira.aluguel.repository.LocadorRepository;

@RestController
@RequestMapping("/locador")
public class LocadorController {
	
	@Autowired
	private LocadorRepository locadorRepository;
	
	@GetMapping
	public List<Locador> retornaLocadores( ) {
		return locadorRepository.findAll();
	}
	
	@PostMapping("/save")
	public Locador salvaLocador(@RequestBody Locador locador) {
		locadorRepository.save(locador);
		return locador;
	}
}
