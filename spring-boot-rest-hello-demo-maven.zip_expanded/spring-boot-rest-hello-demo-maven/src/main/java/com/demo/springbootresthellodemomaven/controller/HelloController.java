package com.demo.springbootresthellodemomaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. this annotation tells the spring rest framework that this calss is a rest controller
@RequestMapping("api") // 2. this annotation tells the spring rest framework that the request mapping to this class is "api" 
public class HelloController {

	//3. create rest methods - rest methods will expose the rest endpoints
	//						 - keep the method the method public
	//						 - can use any method name
	//					 	 - can return a String or any other data type 
	//						 - rest method should be annotated with either @GetMapping or @PutMapping or @DeleteMapping or @PostMapping
	
	
	// the url to reach this endpoint is - http://localhost:8080/spring-boot-rest-hello-demo-maven/api/hello
	@GetMapping("hello")
	public String sayHello() {
		return "Hello Rest Endpoint!";
	}
	
	
	
}
