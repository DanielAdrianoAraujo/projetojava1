package com.ProativaDigital.ProjetoTesteSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProativaDigital.ProjetoTesteSpring.entities.Order;
import com.ProativaDigital.ProjetoTesteSpring.services.OrderService;


@RestController // Recurso WEB implmentado por um Controlador REST
@RequestMapping(value = "/orders") // Caminho do Recurso ou pagina WEB
public class OrderResource {
	
	
	@Autowired // Gestão de DP com o OrderService
	private OrderService service;
	
	@GetMapping // Responde o tipo GET do HTTP => EndPoint
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);		
	}
	
	@GetMapping(value = "/{id}") // EndPoint find by id
	public ResponseEntity<Order> finById(@PathVariable Long id) {
		Order obj = service.findById(id);	
		return ResponseEntity.ok().body(obj);		
	}
	

}
