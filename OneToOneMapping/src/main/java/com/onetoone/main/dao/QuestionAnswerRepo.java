package com.onetoone.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.onetoone.main.enteties.Question;

public interface QuestionAnswerRepo extends CrudRepository<Question, Integer>{

}
