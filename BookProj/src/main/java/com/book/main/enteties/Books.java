package com.book.main.enteties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String bookName;
	private String bookAurhorName;
	private int bookPrice;
	private String bookIsbn;
	private String bookPyear;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAurhorName() {
		return bookAurhorName;
	}
	public void setBookAurhorName(String bookAurhorName) {
		this.bookAurhorName = bookAurhorName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookPyear() {
		return bookPyear;
	}
	public void setBookPyear(String bookPyear) {
		this.bookPyear = bookPyear;
	}
	
	
	

}
