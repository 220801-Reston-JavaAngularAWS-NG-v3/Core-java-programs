package com.bms.springbootrestjdbcbmsmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.springbootrestjdbcbmsmaven.exception.ApplicationException;
import com.bms.springbootrestjdbcbmsmaven.pojo.BookPojo;
import com.bms.springbootrestjdbcbmsmaven.service.BookService;

@RestController
@RequestMapping("api/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	// write the 5 rest methods corresponding to the 5 endpoints
	
	// Read - getAllBooks - @GetMapping
	// http://localhost:6666/api/books - get
	@GetMapping("")
	public List<BookPojo> getAllBooks() throws ApplicationException{
		// call the corresponding getAllBooks method of the service layer
		// for that we need to create an object of the service layer
		// but with spring framework we can tell the framework to create the object
		
		return bookService.getAllBooks();

	}
	// Read - getABook - @GetMapping
	
	// Create - addBook - @PostMapping
	
	// Update - updateBook - @PutMapping
	
	// Delete - deleteBook - @DeleteMapping
	
	
	
}
