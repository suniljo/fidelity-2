package com.fidelity.rest.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fidelity.rest.dto.Book;
import com.fidelity.rest.repository.LibraryRepository;
import com.fidelity.rest.services.LibraryServices;

@Service
public class LibraryServicesImpl implements LibraryServices {
	private LibraryRepository libraryRepo;
	private List<Book> books;
	
	//constructor injection
	public LibraryServicesImpl(LibraryRepository libraryRepo, List<Book> books) {
		super();
		this.libraryRepo = libraryRepo;
		this.books = libraryRepo.getAllBooks();
	}

	@Override
	public Book findBookById(Integer bid) {
		Book searchedBook = books.stream()
								 .filter(book -> book.getBookId().equals(bid))
								 .findFirst()
								 .orElse(null);
		return searchedBook;
	}

	@Override
	public List<Book> findAll() {
		return books;
	}

	@Override
	public boolean saveBook(Book book) {
		boolean isBookExists = books.stream()
									.noneMatch(bk -> bk.getBookId().equals(book.getBookId()));
		if(isBookExists) {
			books.add(book);
			return true;
		}
		else			
			return false;
	}

	@Override
	public boolean deleteBookById(Integer isbn) {
		Book book = books.stream()
			     		.filter(bk -> bk.getBookId().equals(isbn))
			     		.findAny()
			     		.orElse(null);

		if(book != null) {
			books.remove(book);
			return true;
		}
		return false;
	}

}
