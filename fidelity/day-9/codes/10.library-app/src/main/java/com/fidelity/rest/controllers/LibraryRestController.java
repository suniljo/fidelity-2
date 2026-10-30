package com.fidelity.rest.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.rest.entities.Book;
import com.fidelity.rest.services.LibraryServices;

@RestController
@RequestMapping(path="/api/library")
public class LibraryRestController {
	@Autowired
	private LibraryServices libraryServices;
	
	@GetMapping
	public ResponseEntity<Iterable<Book>> getAllBooks(){
		Iterable<Book> books = libraryServices.findAll();
		return ResponseEntity.ok(books);
	}
	
	@GetMapping(path="/{bid}", produces= {"application/json", "application/xml"})
	public ResponseEntity<Book> searchBookById(@PathVariable Integer bid){
		Book book = libraryServices.findBookById(bid);
		if(book != null) {
			return ResponseEntity.ok().body(book);
		}else {
			return ResponseEntity.notFound().build();
		}			
	}
	
	@PostMapping(consumes = {"application/json", "application/xml"})
	public ResponseEntity<Book> saveNewBook(@RequestBody Book book){
		System.out.println(book);
		Book savedBook = libraryServices.saveBook(book);
		if(savedBook != null)
			return new ResponseEntity<Book>(savedBook, HttpStatus.CREATED);
		
		return ResponseEntity.badRequest().build();
	}	
	
	@DeleteMapping
	public ResponseEntity<?> deleteBook(@RequestParam Integer isbn){
		boolean bookDelStatus = libraryServices.deleteBookById(isbn);
		if(bookDelStatus)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT); //204
		
		return ResponseEntity.notFound().build();
	}	
}
