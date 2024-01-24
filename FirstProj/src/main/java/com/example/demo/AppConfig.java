package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	Alien getAlienobj() {
		Alien alien=new Alien();
		alien.setAid(1);
		alien.setAname("Subhajit");
		alien.setTech("SpringBoot");
		return alien;
	}
	@Bean
	Laptop getlaptop() {
		Laptop lpLaptop=new Laptop();
		lpLaptop.setBrand("Hp");
		lpLaptop.setLid(1);
		return lpLaptop;
	}

}
