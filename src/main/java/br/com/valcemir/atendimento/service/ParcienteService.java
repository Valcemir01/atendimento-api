package br.com.valcemir.atendimento.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.valcemir.atendimento.modelo.Parciente;
import br.com.valcemir.atendimento.repository.ParcienteRepository;

@Service
public class ParcienteService {

	@Autowired
	private ParcienteRepository repository;
	
	public Parciente FindById(Integer id) {
		Optional<Parciente> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
