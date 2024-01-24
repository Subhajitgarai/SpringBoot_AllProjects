package com.postman.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postman.main.entites.Course;
import com.postman.main.service.CourseService;
import com.postman.main.service.CourseservImpl;

@RestController
@RequestMapping("/test")
public class AppController {

	@Autowired
	private CourseservImpl courseService;
	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}
	
	//Get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return courseService.getCourse();
	}
	@GetMapping("/courses/{courseId}")
	public Course getSingleCourses(@PathVariable String courseId){
		return courseService.getSingleCourse(Long.valueOf(courseId));
	}
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCoursenew(course);
	}
	@PutMapping("/courses")
	public Course putCoursedetails(@RequestBody Course course) {
		return courseService.putCourse(course);
	}
	@DeleteMapping("/courses/{courseId}")
	public Course deleteCourse(@PathVariable String courseId) {
		return courseService.deleteCourse(Long.valueOf(courseId));
	}
}
