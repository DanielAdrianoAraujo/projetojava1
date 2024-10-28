package com.ProativaDigital.ProjetoTesteSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProativaDigital.ProjetoTesteSpring.entities.Order;
import com.ProativaDigital.ProjetoTesteSpring.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired // Gestão de Dependencia com o OrderRepository
	private OrderRepository repository;
	
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
