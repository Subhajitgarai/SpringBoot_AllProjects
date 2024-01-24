package com.onetoone.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.main.enteties.Question;
import com.onetoone.main.services.QuestionAnswerServiceInterface;

@RestController
@RequestMapping("/onetoone")
public class QuestionAnswerController {
	@Autowired
	QuestionAnswerServiceInterface qasi;
	@PostMapping("/add")
	public Question addQuestionAnswer(@RequestBody Question question) {
	return	qasi.setQuestionAnswer(question);
	}
	

}
