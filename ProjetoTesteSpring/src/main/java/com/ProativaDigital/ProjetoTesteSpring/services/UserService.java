package com.ProativaDigital.ProjetoTesteSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProativaDigital.ProjetoTesteSpring.entities.User;
import com.ProativaDigital.ProjetoTesteSpring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired // Gestão de Dependencia com o UserRepository
	private UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
