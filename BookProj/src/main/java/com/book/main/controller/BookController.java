package com.book.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class BookController {
	
	@RequestMapping("/home")
	public String loadHome() {
		return "home";
	}
	@RequestMapping("/add")
	public String loadadd() {
		return "add";
	}

}
