package com.rest.restWS.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rest.restWS.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> { }
