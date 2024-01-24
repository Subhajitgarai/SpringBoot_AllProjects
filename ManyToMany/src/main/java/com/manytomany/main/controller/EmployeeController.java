package com.manytomany.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.main.enteties.Employee;
import com.manytomany.main.service.EmployeeService;

@RestController
@RequestMapping("/manytomany")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/add")
	public Employee addEmployeeProject(@RequestBody Employee employee) {
		return employeeService.addEmployeeProject(employee);
	}

}
