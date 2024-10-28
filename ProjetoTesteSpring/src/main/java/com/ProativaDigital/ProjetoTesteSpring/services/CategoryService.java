package com.ProativaDigital.ProjetoTesteSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProativaDigital.ProjetoTesteSpring.entities.Category;
import com.ProativaDigital.ProjetoTesteSpring.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired // Gestão de Dependencia com o CategoryRepository
	private CategoryRepository repository;
	
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
