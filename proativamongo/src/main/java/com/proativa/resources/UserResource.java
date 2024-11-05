package com.proativa.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proativa.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User daniel = new User("1", "Daniel", "daniel@gmail.com");
		User adriano = new User("2", "Adriano", "adriano@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(daniel, adriano));
		return ResponseEntity.ok().body(list);
	}
	
	

}
