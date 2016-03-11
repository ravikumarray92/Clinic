package com.training.entity;

public class Isbn {
	private String intlCode;
	private String bookCode;
	public String category;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Isbn(String intlCode, String bookCode, String category) {
		super();
		this.intlCode = intlCode;
		this.bookCode = bookCode;
		this.category = category;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	@Override
	public String toString() {
		return "Isbn [intlCode=" + intlCode + ", bookCode=" + bookCode + "]";
	}
	public String getIntlCode() {
		return intlCode;
	}
	public void setIntlCode(String intlCode) {
		this.intlCode = intlCode;
	}
	public Isbn() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
