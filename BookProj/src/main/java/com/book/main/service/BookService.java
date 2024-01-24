package com.book.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.main.dao.BookRepo;
import com.book.main.enteties.Books;

@Service
public class BookService {
	@Autowired
	BookRepo bookRepo;
	
	public void add(String bname,String aname,String isbn,int price, String year) {
		Books book=new Books();
		book.setBookAurhorName(aname);
		book.setBookName(bname);
		book.setBookIsbn(isbn);
		book.setBookPrice(price);
		book.setBookPyear(year);
		bookRepo.save(book);
	}

}
