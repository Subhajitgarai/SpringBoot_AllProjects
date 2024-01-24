package com.jpa.main.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jpa.main.enteties.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer> {

}
