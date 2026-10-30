package com.fidelity.rest.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fidelity.rest.entities.Book;
import com.fidelity.rest.repository.LibraryRepository;
import com.fidelity.rest.services.LibraryServices;

@Service
public class LibraryServicesImpl implements LibraryServices {
	private LibraryRepository libraryRepo;
	
	//constructor injection
	public LibraryServicesImpl(LibraryRepository libraryRepo) {
		super();
		this.libraryRepo = libraryRepo;
	}

	@Override
	public Book findBookById(Integer bid) {
		Book searchedBook = null;
		
		Optional<Book> optBook = libraryRepo.findById(bid);
		if(optBook.isPresent()) {
			searchedBook = optBook.get();
		}
		return searchedBook;
	}

	@Override
	public Iterable<Book> findAll() {
		return libraryRepo.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		boolean isBookExists = libraryRepo.existsById(book.getBookId());
		if(!isBookExists) {
			Book savedBook = libraryRepo.save(book);
			return savedBook;
		}
		else			
			return null;
	}

	@Override
	public boolean deleteBookById(Integer isbn) {
        boolean isBookExists = libraryRepo.existsById(isbn);

		if(isBookExists) {
			libraryRepo.deleteById(isbn);
			return true;
		}
		return false;
	}

}
