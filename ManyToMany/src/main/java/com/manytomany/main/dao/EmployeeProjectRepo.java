package com.manytomany.main.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manytomany.main.enteties.Employee;

@Repository
public interface EmployeeProjectRepo extends CrudRepository<Employee, Integer> {

}
