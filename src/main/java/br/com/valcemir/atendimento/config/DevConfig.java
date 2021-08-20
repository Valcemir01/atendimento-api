package br.com.valcemir.atendimento.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.valcemir.atendimento.service.DBService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBService service;
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean InstanciaDB() {
		if(strategy.equals("create")) {
			this.service.IniciarDB();
		}		
		return false;
	}
}
