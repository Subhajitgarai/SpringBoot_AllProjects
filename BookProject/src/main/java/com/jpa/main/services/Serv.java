package com.jpa.main.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.main.config.Appconfig;
import com.jpa.main.dao.BookRepo;
import com.jpa.main.enteties.Book;

public class Serv {
	
	public void setBookdetails() {
		ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		BookRepo bRepo=context.getBean(BookRepo.class);
		Book book=new Book();
		book.setAuthorName("Subhajit");
		book.setBookName("Programming");
		book.setIsbnNumber("BOOK_4576253");
		book.setPrice(2000);
		book.setPublishYear(2024);
		bRepo.save(book);
	}

}
