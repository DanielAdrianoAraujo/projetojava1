package com.proativa.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

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

import com.proativa.domain.Post;
import com.proativa.domain.User;
import com.proativa.dto.UserDTO;
import com.proativa.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll(){
		List<User> list = service.findAll();
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@GetMapping(value = "/{id}") // EndPoint find by id
	public ResponseEntity<UserDTO> finById(@PathVariable String id) {
		User obj = service.findById(id);	
		return ResponseEntity.ok().body(new UserDTO(obj));		
	}
	
	@PostMapping // EndPoint para insert
	public ResponseEntity<Void> insert(@RequestBody UserDTO objDto) {
		User obj = service.fromDto(objDto);	
		obj = service.insert(obj);
		// Após a inserção dos dados no MongoDB ele retorna a URL com o novo código inserido
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();		
	}
	
	@DeleteMapping(value = "/{id}") // EndPoint find by id
	public ResponseEntity<Void> delete(@PathVariable String id) {
		service.delete(id);	
		return ResponseEntity.noContent().build();		
	}
	
	
	@PutMapping(value = "/{id}") // EndPoint para Put
	public ResponseEntity<Void> update(@RequestBody UserDTO objDto, @PathVariable String id) {
		User obj = service.fromDto(objDto);	
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	
	@GetMapping(value = "/{id}/posts") // EndPoint find by posts
	public ResponseEntity<List<Post>> findPosts(@PathVariable String id) {
		User obj = service.findById(id);	
		return ResponseEntity.ok().body(obj.getPosts());		
	}
	
}
