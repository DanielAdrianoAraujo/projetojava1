package com.ProativaDigital.ProjetoTesteSpring.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ProativaDigital.ProjetoTesteSpring.entities.User;
import com.ProativaDigital.ProjetoTesteSpring.repositories.UserRepository;

@Configuration // Classe user de configuração
@Profile("test") // Configuração exclusiva para user teste
public class TestConfing implements CommandLineRunner {
	
	@Autowired // AUTOCONECTADO Associa uma dependencia de UserRepository dentro dessa classe
	private UserRepository userRepository;

	// Essa implementação de CommandLineRunner é para executar essa classe quando 
	// for iniciado
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	

}
