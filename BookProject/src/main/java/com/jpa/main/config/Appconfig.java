package com.jpa.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jpa.main.dao.BookRepo;

@Configuration
public class Appconfig {
	@Autowired
	BookRepo br;
	@Bean
	BookRepo getbrepo() {
		return br;
	}

}
