package com.training.entity;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
	private String subject;
	private Isbn code;
	
	
	public Isbn getCode() {
		return code;
	}
	public void setCode(Isbn code) {
		this.code = code;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	Logger log = Logger.getLogger(this.getClass().getName());
	private long bookNumber;
	private String bookName;

	public long getBookNumber() {
		log.info("====================getBookNumber() Called===================");
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
		log.info("====================setBookNumber() Called===================");
	}
	public String getBookName() {
		log.info("====================getBookName() Called=========================");
		return bookName;
		
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
		log.info("====================setBookName() Called=========================");
	}
	public Book() {
		super();
		log.info("===================Book Initialized==========================");
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + "]";
	}
	
}
