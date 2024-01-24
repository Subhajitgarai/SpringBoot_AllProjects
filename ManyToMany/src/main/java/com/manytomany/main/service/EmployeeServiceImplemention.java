package com.manytomany.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manytomany.main.dao.EmployeeProjectRepo;
import com.manytomany.main.enteties.Employee;

@Component
public class EmployeeServiceImplemention implements EmployeeService {
	@Autowired
	EmployeeProjectRepo employeeProjectRepo;

	public Employee addEmployeeProject(Employee employee) {
		return employeeProjectRepo.save(employee);

	}

}
