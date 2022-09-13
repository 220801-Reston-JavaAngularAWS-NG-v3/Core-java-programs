package com.demo.springbootresthellodemomaven.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootresthellodemomaven.pojo.UserPojo;

@RestController // 1. this annotation tells the spring rest framework that this calss is a rest controller
@RequestMapping("api") // 2. this annotation tells the spring rest framework that the request mapping to this class is "api" 
public class HelloController {

	//3. create rest methods - rest methods will expose the rest endpoints
	//						 - keep the method the method public
	//						 - can use any method name
	//					 	 - can return a String or any other data type 
	//						 - rest method should be annotated with either @GetMapping or @PutMapping or @DeleteMapping or @PostMapping
	
	
	// the url to reach this endpoint is - http://localhost:7777/api/hello
	@GetMapping("hello")
	public String sayHello() {
		return "Hello Rest Endpoint!";
	}
	
	// the url to reach this endpoint is - http://localhost:7777/api/users
	@GetMapping("users")
	public List<UserPojo> retrieveAllUsers() {
		List<UserPojo> allUsers = new ArrayList<UserPojo>();

		allUsers.add(new UserPojo("John", "Carter"));
		allUsers.add(new UserPojo("Harry", "Potter"));
		allUsers.add(new UserPojo("Ron", "Weasley"));
		
		return allUsers;
	
	}
	
	
	
	// these mappings correspond to the CRUD operation
	// Create - @PostMapping
	// Read - @GetMapping
	// Update - @UpdateMapping
	// Delete - @DeleteMapping
}
