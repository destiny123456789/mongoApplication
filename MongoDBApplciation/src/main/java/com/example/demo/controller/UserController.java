package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

//import com.sun.tools.javac.util.List;

@RestController
public class UserController {
	
	
	@Autowired
	private UserRepository repo;
	
	
	@PostMapping("/save")
	public ResponseEntity<String> store(@RequestBody User user){
		 repo.save(user);
		 return new ResponseEntity<String>("User is saved",HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public List<User> searchAllUsers() {
		//System.out.println("name is "+name);
		//return userrepository.findAll();
		return repo.findAll();
		//return userservice.findbyfirstnameservice(name);
		
	}
	
	 @GetMapping("/pincode/{pinocde}")
		//@CrossOrigin(allowedHeaders = "*")
		public List<User> searchbysurnamename(@PathVariable(value = "pinocde") String pincode) {
			return repo.findByPincode(pincode);
			
			
		}
	
	 @RequestMapping(value="/userupdate/{username}", method =RequestMethod.PUT, consumes ="application/json")
		//@CrossOrigin(allowedHeaders = "*")
		public ResponseEntity<Object> updateUser(@RequestBody User user,@PathVariable String username) {

			User useroptional = repo.findByUsername(username);

			//if (!((Object) useroptional)id())
				//return ResponseEntity.notFound().build();
	       //Student s1= studentOptional.get(0);
			//useroptional.setId(user.getId());
			//useroptional.setId(user.getId());
			useroptional.setUsername(user.getUsername());
			useroptional.setName(user.getName());
			useroptional.setPassword(user.getPassword());
			useroptional.setAddress(user.getAddress());
			//useroptional.setFirstName(user.ge());
			//useroptional.setLastName(user.getLastName());
			useroptional.setPincode(user.getPincode());
			useroptional.setCity(user.getCity());
			useroptional.setEmail(user.getEmail());
			
			//System.out.println("printingh studnet id "+id);
			repo.save(useroptional);

			//return ResponseEntity.noContent().build();
			return new  ResponseEntity<>("Data is updated successfully", HttpStatus.OK);
				}
	@DeleteMapping("/udelete/{username}")
	//@CrossOrigin(allowedHeaders = "*")
	public ResponseEntity<Object> deletedbyid(@PathVariable String username) {
		 repo.deleteById(username);
		 return new ResponseEntity<>("Data is deleted successsfully", HttpStatus.OK);
	}
	

}
