package com.onetomany.main.service;

import org.springframework.stereotype.Service;

import com.onetomany.main.enteties.Question;

@Service
public interface Questionserviceinterface {
	Question questionAnswerAdd(Question question);
}
