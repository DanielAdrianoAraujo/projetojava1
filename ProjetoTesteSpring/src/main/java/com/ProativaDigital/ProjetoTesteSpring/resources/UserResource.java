package com.ProativaDigital.ProjetoTesteSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProativaDigital.ProjetoTesteSpring.entities.User;


@RestController // Recurso WEB implmentado por um controlador REST
@RequestMapping(value = "/users") // Caminho do Recurso ou pagina WEB
public class UserResource {
	
	@GetMapping // Responde o tipo GET do HTTP
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Daniel", "daniel@gmail.com", "998237489", "4332");
		return ResponseEntity.ok().body(u);		
	}
	

}
