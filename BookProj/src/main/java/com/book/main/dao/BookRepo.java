package com.book.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.book.main.enteties.Books;

public interface BookRepo extends CrudRepository<Books, Integer> {

}
