package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.User;

//import org.springframework.data.mongodb.MongoDbFactory;
import java.util.*;


public interface UserRepository extends MongoRepository<User, String> {
	
	List<User> findByPincode(String pincode);
	
	   User findByUsername(String username);
	   
	 //  User findByEmail(String email);

}