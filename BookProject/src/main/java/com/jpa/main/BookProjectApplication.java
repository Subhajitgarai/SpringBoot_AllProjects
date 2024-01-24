package com.jpa.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.main.dao.BookRepo;
import com.jpa.main.enteties.Book;
import com.jpa.main.services.Serv;


@SpringBootApplication
public class BookProjectApplication {

	public static void main(String[] args) {
ApplicationContext context=	SpringApplication.run(BookProjectApplication.class, args);
//		BookRepo bRepo=context.getBean(BookRepo.class);
      Serv serv=new Serv();		
      serv.setBookdetails();
		
		
	}

}
