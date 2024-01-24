package com.jpa.test;

import java.util.List;
import java.util.Optional;

import javax.xml.transform.Source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepo;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(BootjpaexampleApplication.class, args);
		System.out.println("Started SpringBoot Jpa");
		UserRepo userrepo=context.getBean(UserRepo.class);
		
//		User user1=new User();
//		user1.setName("Subhajit");
//		user1.setCity("Kolkata");
//		user1.setStatus("Java Programmer");
//		User use1=userrepo.save(user);
//		System.out.println(user1);
		
//		User user2=new User();
//		user2.setName("Sayan");
//		user2.setCity("Newtown");
//		user2.setStatus("Java Programmer");
		
		//Saving Multiple objects by list
		
//		List<User>users=List.of(user1,user2);
//		
//		Iterable<User>aftersave=userrepo.saveAll(users);
//		
//		aftersave.forEach(user->{
//			System.out.println(user);
//		});
		
		
		
		//Update the user of id 202
//		Optional<User>fbi=userrepo.findById(203);
//		User user=fbi.get();
//		user.setName("Sayak");
//		userrepo.save(user);
//		System.out.println(user);
//	   System.out.println("Updated");
		
		
		//Get the Data
		//findById->return Optional containing data
		
		Iterable<User>getall=userrepo.findAll();
		
		
		getall.forEach(user->{
			System.out.println(user.getName());
		});
		
		//Delete
//		userrepo.deleteById(203);
		
		//Find By name
		
		List<User>getbyname=userrepo.findByName("Subhajit");
		System.out.println(getbyname);
//		System.out.println(ur);
		
		
		
		
		
		
		
	}

}
