package com.proativa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proativa.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	
}
