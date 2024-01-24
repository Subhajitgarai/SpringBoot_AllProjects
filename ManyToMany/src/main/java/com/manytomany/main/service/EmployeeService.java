package com.manytomany.main.service;

import org.springframework.stereotype.Service;

import com.manytomany.main.enteties.Employee;

@Service
public interface EmployeeService {
	Employee addEmployeeProject(Employee employee);

}
