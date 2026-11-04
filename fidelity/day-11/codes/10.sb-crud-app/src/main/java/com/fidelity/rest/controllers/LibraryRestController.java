package com.fidelity.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fidelity.rest.dto.Book;
import com.fidelity.rest.services.LibraryServices;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path="/api/library")
public class LibraryRestController {
	@Autowired
	private LibraryServices libraryServices;
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> books = libraryServices.findAll();
		return ResponseEntity.ok(books);
	}
	
	@GetMapping(path="/{bid}")
	public ResponseEntity<Book> searchBookById(@PathVariable Integer bid){
		Book book = libraryServices.findBookById(bid);
		if(book != null) {
			return ResponseEntity.ok().body(book);
		}else {
			return ResponseEntity.notFound().build();
		}			
	}

	/*
	@PostMapping
	public ResponseEntity<Book> saveNewBook(@RequestBody Book book){
		System.out.println(book);
		boolean isBookAdded = libraryServices.saveBook(book);
		
		if(isBookAdded)
			return new ResponseEntity<Book>(book, HttpStatus.CREATED);
		
		return ResponseEntity.badRequest().build();
	}	
	*/
	
	
	@PostMapping
	public ResponseEntity<Book> saveNewBook(@ModelAttribute Book book, HttpServletRequest request){
		System.out.println("Book ID = " + request.getParameter("bookId"));
		System.out.println("Book Title = " + request.getParameter("bookTitle"));
		System.out.println("Book Price = " + request.getAttribute("bookPrice"));
		
		System.out.println("Protocol = " + request.getProtocol());
		System.out.println("Method = " + request.getMethod());
		
		System.out.println("URL = " + request.getRequestURL());
		System.out.println("application name = " + request.getContextPath());
		System.out.println("Server Name : = " + request.getServerName());
		System.out.println(book);
		boolean isBookAdded = libraryServices.saveBook(book);
		
		if(isBookAdded)
			return new ResponseEntity<Book>(book, HttpStatus.CREATED);
		
		return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteBook(@RequestParam Integer isbn){
		boolean bookDelStatus = libraryServices.deleteBookById(isbn);
		if(bookDelStatus)
			return new ResponseEntity<Void>(HttpStatus.OK);
		
		return ResponseEntity.notFound().build();
	}	
	
	@PutMapping(path="/{isbn}")
	public ResponseEntity<?> updateBook(@PathVariable Integer isbn, @RequestBody Book updateBook){
		boolean bookModificationStatus = libraryServices.modifyBookDetailsById(isbn, updateBook);
		if(bookModificationStatus)
			return new ResponseEntity<Void>(HttpStatus.OK);
		
		return ResponseEntity.notFound().build();
	}	
}
