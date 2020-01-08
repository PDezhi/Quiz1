package com.johnabbott.librarySystem.model;

public class Book {
	
	String bookName;
	String bookType;
	String author;
	
	public Book(String bookName, String bookType, String Author) {
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = Author;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		author = author;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
}
