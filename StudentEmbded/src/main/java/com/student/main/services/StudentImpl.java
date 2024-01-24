package com.student.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.main.dao.StudentRepo;
import com.student.main.entites.Student;

@Component
public class StudentImpl implements StudentServiceInterfac {
	@Autowired
	StudentRepo sRepo;

	public Student setStudentDetails(Student student) {
		return sRepo.save(student);
	}

}
