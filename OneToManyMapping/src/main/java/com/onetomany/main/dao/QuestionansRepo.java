package com.onetomany.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.onetomany.main.enteties.Question;

public interface QuestionansRepo extends CrudRepository<Question, Integer> {

}
