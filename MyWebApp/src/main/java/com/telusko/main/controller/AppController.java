package com.telusko.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
//	@RequestMapping("/")
//	@ResponseBody
//	public  String firstLoad() {
//		return "Hello World !!";
//	}
	@RequestMapping("/home")
	public String loadHome() {
		return "home";
	}

}
