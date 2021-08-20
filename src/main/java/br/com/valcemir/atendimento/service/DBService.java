package br.com.valcemir.atendimento.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.valcemir.atendimento.modelo.Atendimento;
import br.com.valcemir.atendimento.modelo.Parciente;
import br.com.valcemir.atendimento.repository.AtendimentoRepository;
import br.com.valcemir.atendimento.repository.ParcienteRepository;

@Service
public class DBService {
	@Autowired
	ParcienteRepository pRepository;
	@Autowired
	AtendimentoRepository aRepository;
	Date d = new Date();

	public void IniciarDB() {
		Parciente parciente = new Parciente(null, "Alexandre", "Apivida", d, "teste");
		Parciente parciente2 = new Parciente(null, "Sofia", "Apivida", d, "teste");
		Parciente parciente3 = new Parciente(null, "Isabele", "Camed", d, "teste");

		Atendimento atendimento = new Atendimento(null, 60, d, "Teste", parciente2);
		Atendimento atendimento2 = new Atendimento(null, 30, d, "Teste", parciente3);
		Atendimento atendimento3 = new Atendimento(null, 60, d, "Teste", parciente3);
		Atendimento atendimento4 = new Atendimento(null, 60, d, "Teste", parciente2);
		Atendimento atendimento5 = new Atendimento(null, 30, d, "Teste", parciente);

		parciente.getAtendimentos().addAll(Arrays.asList(atendimento5));
		parciente2.getAtendimentos().addAll(Arrays.asList(atendimento));
		parciente3.getAtendimentos().addAll(Arrays.asList(atendimento2));
		parciente3.getAtendimentos().addAll(Arrays.asList(atendimento3));
		parciente2.getAtendimentos().addAll(Arrays.asList(atendimento4));

		this.pRepository.saveAll(Arrays.asList(parciente, parciente2, parciente3));
		this.aRepository.saveAll(Arrays.asList(atendimento, atendimento2, atendimento3, atendimento4, atendimento5));
	}

}
