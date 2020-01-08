package com.johnabbott.librarySystem.service;

import java.util.List;

import com.johnabbott.librarySystem.model.Book;

public interface BookService {
	public List<Book> getComputerBooks();
	public List<Book> getNovelBooks();

}
