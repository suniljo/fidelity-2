package com.example.rest.services;

import java.util.List;

import com.example.rest.dto.Book;

public interface LibraryServices {
	
	public Book findBookById(Integer bid);	
	public List<Book> findAll();
	
	public boolean saveBook(Book book);
	public boolean deleteBookById(Integer isbn);
	
	public boolean modifyBookDetailsById(Integer isbn, Book updateBook);
}
