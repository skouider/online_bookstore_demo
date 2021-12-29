package com.enset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enset.models.Book;
import com.enset.repository.BookRepository;

@RestController
@CrossOrigin("*")
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/listBooks")
	public List<Book> list(){
	   return bookRepository.findAll();	
	}
}
