package com.student.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.student.main.entites.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{

}
