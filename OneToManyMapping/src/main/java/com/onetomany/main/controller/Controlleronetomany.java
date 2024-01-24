package com.onetomany.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.main.enteties.Question;
import com.onetomany.main.service.Questionserviceinterface;

@RestController
@RequestMapping("/onetomany")
public class Controlleronetomany {
	@Autowired
	Questionserviceinterface qsQuestionserviceinterface;
	
	@PostMapping("/add")
	public Question addQuestionsAnswers(@RequestBody Question question) {
		
		
//		System.out.println(question.toString());
		
		return qsQuestionserviceinterface.questionAnswerAdd(question);
	}
}
