package com.onetoone.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.onetoone.main.dao.QuestionAnswerRepo;
import com.onetoone.main.enteties.Question;

@Component
public class QuestionAnsImp implements QuestionAnswerServiceInterface {
	@Autowired
	QuestionAnswerRepo qaRepo;
	
	public Question setQuestionAnswer(Question question) {
		return qaRepo.save(question);
	}
	
	

}
