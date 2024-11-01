package com.ProativaDigital.ProjetoTesteSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProativaDigital.ProjetoTesteSpring.entities.User;
import com.ProativaDigital.ProjetoTesteSpring.repositories.UserRepository;
import com.ProativaDigital.ProjetoTesteSpring.services.exceptions.ResourceNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired // Gestão de Dependencia com o UserRepository
	private UserRepository repository;
	
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		// ele tenta dar um GET, senão consegue lança essa excessão escrita em lambida
		return obj.orElseThrow(() -> new ResourceNotFoundException(id)); 
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	@Transactional // garante que a sessão esteja ativa até o fim do método
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id); // prepara o obj monitorado pelo JPA
		updateData(entity, obj);
		return repository.save(entity);
	}

	
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
