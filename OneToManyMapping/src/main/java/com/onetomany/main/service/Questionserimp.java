package com.onetomany.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.onetomany.main.dao.QuestionansRepo;
import com.onetomany.main.enteties.Answer;
import com.onetomany.main.enteties.Question;


@Component
public class Questionserimp implements Questionserviceinterface {
	
	@Autowired
	QuestionansRepo qaRepo;
	

	@Override
	public Question questionAnswerAdd(Question question) {
	return	qaRepo.save(question);
		
	}

}
