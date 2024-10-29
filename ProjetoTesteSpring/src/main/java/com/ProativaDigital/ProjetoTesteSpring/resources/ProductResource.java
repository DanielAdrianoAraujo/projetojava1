package com.ProativaDigital.ProjetoTesteSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProativaDigital.ProjetoTesteSpring.entities.Product;
import com.ProativaDigital.ProjetoTesteSpring.services.ProductService;


@RestController // Recurso WEB implmentado por um Controlador REST
@RequestMapping(value = "/products") // Caminho do Recurso ou pagina WEB
public class ProductResource {
	
	
	@Autowired // Gestão de DP com o ProductService
	private ProductService service;
	
	@GetMapping // Responde o tipo GET do HTTP => EndPoint
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);		
	}
	
	@GetMapping(value = "/{id}") // EndPoint find by id
	public ResponseEntity<Product> finById(@PathVariable Long id) {
		Product obj = service.findById(id);	
		return ResponseEntity.ok().body(obj);		
	}
	

}
