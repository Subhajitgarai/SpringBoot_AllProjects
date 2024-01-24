package com.postman.main.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.postman.main.entites.Course;

@Service
public class CourseservImpl implements CourseService {
	List<Course>list;
   
	public CourseservImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"Java Course","This Contains basics of java"));
		list.add(new Course(146,"C Course","This is C Course"));
	}

	public List<Course>getCourse(){
		return list;
	}

	public Course getSingleCourse(long courseId) {
		Iterator itr=list.iterator();
		Course c=null;
		while(itr.hasNext()) {
			c=(Course) itr.next();
			if(c.getId()==courseId) {
				break;
				
				
			}
		}
		return c;
		
	}

	public Course addCoursenew(Course course) {
		list.add(course);
		return course;
	}
	
	public Course putCourse(Course course){
		list.add(course);
		return course;
	}
	
	public Course deleteCourse(long courseId) {
		
		Iterator itr=list.iterator();
		Course c=null;
		while(itr.hasNext()) {
			c=(Course) itr.next();
			if(c.getId()==courseId) {
				
				break;
				
				
			}
		}
		list.remove(c);
		return c;
		
		
		
		
	}

}
