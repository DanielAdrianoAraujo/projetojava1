package com.ProativaDigital.ProjetoTesteSpring.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@PostMapping // Essa é a forma adequada de se inserir um novo registro no Banco de Dados
	public ResponseEntity<User> insert(@RequestBody User obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}	
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
}
