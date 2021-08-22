package br.com.valcemir.atendimento.resouce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.valcemir.atendimento.modelo.Parciente;
import br.com.valcemir.atendimento.service.ParcienteService;

@RestController
@RequestMapping(value = "/parciente")
public class ParcienteResource {
	
	@Autowired
	private ParcienteService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Parciente> FindById(@PathVariable Integer id){
		Parciente parciente = service.FindById(id);
		return ResponseEntity.ok().body(parciente);
	}
}
