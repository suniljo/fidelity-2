package com.fidelity.lms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.lms.dto.Book;
import com.fidelity.lms.services.LibraryServices;

@RestController
@RequestMapping(path = "/api/library")
public class LibraryRestController {
	@Autowired  //DI - field injection
	private LibraryServices libServices;
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> books = libServices.findAllBooks();
		return ResponseEntity.ok(books);
	}
	
	@GetMapping(path="/{bid}")
	public ResponseEntity<Book> searchBookById(@PathVariable Integer bid){
		Book book = libServices.findBookById(bid);
		if(book != null) {
			return ResponseEntity.ok().body(book);
		}else {
			return ResponseEntity.notFound().build();
		}			
	}	
}
