package com.proativa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proativa.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	
	
}
