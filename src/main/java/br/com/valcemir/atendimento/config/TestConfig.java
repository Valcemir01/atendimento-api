package br.com.valcemir.atendimento.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.valcemir.atendimento.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	@Autowired
	private DBService service;
	
	@Bean
	public void InstanciaDB() {
		//this.service.IniciarDB();
	}

}
