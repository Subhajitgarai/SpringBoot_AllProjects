package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjApplication.class, args);
		System.out.println("SpringBoot Started");
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Alien alien=context.getBean(Alien.class);
		System.out.println(alien.getAid());
		System.out.println(alien.getAname());
		System.out.println(alien.getTech());
		alien.getLaptop();
		
		//Another Way
//		ConfigurableApplicationContext co=SpringApplication.run(FirstProjApplication.class, args);
//		Alien alien=co.getBean(Alien.class);
//		System.out.println(alien.getAid());
//		System.out.println(alien.getAname());
//		System.out.println(alien.getTech());
		
		
		
		
		
	}

}
