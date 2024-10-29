package com.ProativaDigital.ProjetoTesteSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProativaDigital.ProjetoTesteSpring.entities.Product;
import com.ProativaDigital.ProjetoTesteSpring.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired // Gestão de Dependencia com o ProductRepository
	private ProductRepository repository;
	
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
