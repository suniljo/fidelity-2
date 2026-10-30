package com.fidelity.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fidelity.lms.dto.Book;
import com.fidelity.lms.repository.LibraryRepository;

@Service
public class LibraryServices {
	/*
	@Autowired //DI - field injection
	private LibraryRepository libraryRepo;
	*/
	
	private LibraryRepository libraryRepo;
	private List<Book> books;
	
    //constructor injection
	public LibraryServices(LibraryRepository libraryRepo) {
		super();
		this.libraryRepo = libraryRepo;
		this.books = libraryRepo.getAllBooks();
	}

	public List<Book> findAllBooks(){
		return books;
	}

	public Book findBookById(Integer bid) {
		/*
		Book searchedBook = books.stream()
				 				 .filter(book -> book.getBookId().equals(bid))
				 				 .findFirst()
				 				 .orElse(null);
		return searchedBook;
		*/
		
		for(Book bk : books) {
			if(bk.getBookId().equals(bid)) {
				return bk;
			}
		}
		return null;
	}
	
}
