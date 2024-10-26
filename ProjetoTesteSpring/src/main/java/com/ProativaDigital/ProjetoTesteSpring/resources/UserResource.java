package com.ProativaDigital.ProjetoTesteSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProativaDigital.ProjetoTesteSpring.entities.User;
import com.ProativaDigital.ProjetoTesteSpring.services.UserService;


@RestController // Recurso WEB implmentado por um Controlador REST
@RequestMapping(value = "/users") // Caminho do Recurso ou pagina WEB
public class UserResource {
	
	
	@Autowired // Gestão de DP com o UserService
	private UserService service;
	
	@GetMapping // Responde o tipo GET do HTTP => EndPoint
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);		
	}
	
	@GetMapping(value = "/{id}") // EndPoint find by id
	public ResponseEntity<User> finById(@PathVariable Long id) {
		User obj = service.findById(id);	
		return ResponseEntity.ok().body(obj);		
	}
	

}
