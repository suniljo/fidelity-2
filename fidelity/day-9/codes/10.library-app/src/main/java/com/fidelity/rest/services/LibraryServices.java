package com.fidelity.rest.services;

import java.util.List;

import com.fidelity.rest.entities.Book;

public interface LibraryServices {
	
	public Book findBookById(Integer bid);	
	public Iterable<Book> findAll();
	
	public Book saveBook(Book book);
	public boolean deleteBookById(Integer isbn);
}
