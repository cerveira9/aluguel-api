package com.cerveira.aluguel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cerveira.aluguel.model.Aluguel;
import com.cerveira.aluguel.model.Corretor;
import com.cerveira.aluguel.model.Imovel;
import com.cerveira.aluguel.model.Locador;
import com.cerveira.aluguel.model.Locatario;
import com.cerveira.aluguel.repository.AluguelRepository;
import com.cerveira.aluguel.repository.CorretorRepository;
import com.cerveira.aluguel.repository.ImovelRepository;
import com.cerveira.aluguel.repository.LocadorRepository;
import com.cerveira.aluguel.repository.LocatarioRepository;

@RestController
@RequestMapping("/aluguel")
public class AluguelController {

	@Autowired
	private AluguelRepository aluguelRepository;
	
	@Autowired
	private CorretorRepository corretorRepository;

	@Autowired
	private ImovelRepository imovelRepository;
	
	@Autowired
	private LocadorRepository locadorRepository;
	
	@Autowired
	private LocatarioRepository locatarioRepository;

	@Autowired
	private Corretor corretor;
	
	@Autowired
	private Imovel imovel;
	
	@Autowired
	private Locador locador;
	
	@Autowired
	private Locatario locatario;
	
	@GetMapping
	public List<Aluguel> retornaAlugueis( ) {
		return aluguelRepository.findAll();
	}
	
	public Corretor getCorretorById(Long id) {
		return corretorRepository.getById(id);
	}
	
	public Imovel getImovelById(Long id) {
		return imovelRepository.getById(id);
	}
	
	public Locador getLocadorById(Long id) {
		return locadorRepository.getById(id);
	}
	
	public Locatario getLocatarioById(Long id) {
		return locatarioRepository.getById(id);
	}
	
	@PostMapping("/save")
	public Aluguel salvaAluguel(@RequestBody Aluguel aluguel) {
		corretor = getCorretorById(aluguel.getCorretor().getId());
		imovel = getImovelById(aluguel.getImovel().getId());
		locador = getLocadorById(aluguel.getLocador().getId());
		locatario = getLocatarioById(aluguel.getLocatario().getId());
		
		aluguel.setCorretor(corretor);
		aluguel.setImovel(imovel);
		aluguel.setLocador(locador);
		aluguel.setLocatario(locatario);
		aluguelRepository.save(aluguel);
		return aluguel;
	}
}
