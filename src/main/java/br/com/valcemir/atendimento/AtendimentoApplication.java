package br.com.valcemir.atendimento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.valcemir.atendimento.modelo.Atendimento;
import br.com.valcemir.atendimento.modelo.Parciente;
import br.com.valcemir.atendimento.repository.AtendimentoRepository;
import br.com.valcemir.atendimento.repository.ParcienteRepository;

@SpringBootApplication
public class AtendimentoApplication implements CommandLineRunner {
	@Autowired
	ParcienteRepository pRepository;
	@Autowired
	AtendimentoRepository aRepository;
	Date d = new Date();
		
	public static void main(String[] args) {
		SpringApplication.run(AtendimentoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Parciente parciente = new Parciente(null, "Alice", "Apivida", d, "teste");
		Atendimento atendimento = new Atendimento(null, 60, d, "Teste", parciente);
		parciente.getAtendimentos().addAll(Arrays.asList(atendimento));
		this.pRepository.save(parciente);
		this.aRepository.save(atendimento);
	}

}
