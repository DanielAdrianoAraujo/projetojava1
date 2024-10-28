package com.ProativaDigital.ProjetoTesteSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProativaDigital.ProjetoTesteSpring.entities.Category;
import com.ProativaDigital.ProjetoTesteSpring.services.CategoryService;


@RestController // Recurso WEB implmentado por um Controlador REST
@RequestMapping(value = "/categories") // Caminho do Recurso ou pagina WEB
public class CategoryResource {
	
	
	@Autowired // Gestão de DP com o CategoryService
	private CategoryService service;
	
	@GetMapping // Responde o tipo GET do HTTP => EndPoint
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);		
	}
	
	@GetMapping(value = "/{id}") // EndPoint find by id
	public ResponseEntity<Category> finById(@PathVariable Long id) {
		Category obj = service.findById(id);	
		return ResponseEntity.ok().body(obj);		
	}
	

}
