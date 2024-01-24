package com.student.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.main.entities.Student;
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
	
	   @Query(value="select * from student where sname= :stuname",nativeQuery = true)
       public List<Student> getStudentByName(@Param("stuname") String stuname);
	   
	   @Query("Select sname from Student")
	   public List<String>getAllName();
    	   
	   @Modifying
	   @Query("Delete from Student where sid=:sid")
       public void dbi(@Param("sid") int sid);
	   //Modifiying used to get know server it is a Delete Query
}
