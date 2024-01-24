package com.student.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.main.entites.Student;
import com.student.main.services.StudentServiceInterfac;

@RestController
@RequestMapping("/studentem")
public class StudentController {
	@Autowired
	StudentServiceInterfac studentservice;
	
	@PostMapping("/add")
	public Student setStudentDetails(@RequestBody Student student) {
	return	studentservice.setStudentDetails(student);
	}

}
