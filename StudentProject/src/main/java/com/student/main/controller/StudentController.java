package com.student.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.student.main.entities.Student;
import com.student.main.services.StudentMasterInterface;
import com.student.main.services.StudentService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/student")
public class StudentController {
 
	@GetMapping("/hi")
	public String rr() {
		return "Subhajit";
	}
	@Autowired
	StudentMasterInterface studentService;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student stu) {
		return studentService.addStudent(stu);
		
	}
	@GetMapping("/getstudent")
	public Iterable<Student> getallDetails(){
		 return studentService.getallDetails();
	}
	@GetMapping("/getstudent/{bid}")
	public Optional<Student> getallDetailsById(@PathVariable String bid){
		return studentService.getDetailsById(Integer.valueOf(bid));
		
	}
	@DeleteMapping("/delete/{sid}")
	public String deleteById(@PathVariable String sid) {
		return studentService.deleteById(Integer.valueOf(sid));
	}
	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		return studentService.update(student);
	}
	@PutMapping("/update/{sid}")
	public String UpdateById(@PathVariable String sid,@RequestBody Student student) {
		return studentService.updateById(Integer.valueOf(sid), student);
	}
	
	@GetMapping("/getstudentbyname/{sname}")
	public List<Student> getStudentbyName(@PathVariable String sname) {
		return studentService.getStudentByName(sname);
	}
	
	@GetMapping("/getallname")
	public List<String> getAllName() {
		return studentService.getallStudentName();
	}
	
	@DeleteMapping("/dqid/{sid}")
	public String deleteByIdQuery(@PathVariable int sid) {
		return studentService.deleteByIdQuery(sid);
	}

}
