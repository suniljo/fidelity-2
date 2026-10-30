package com.fidelity.rest.repository;
import org.springframework.data.repository.CrudRepository;

import com.fidelity.rest.entities.Book;

public interface LibraryRepository extends CrudRepository<Book, Integer> {
}
