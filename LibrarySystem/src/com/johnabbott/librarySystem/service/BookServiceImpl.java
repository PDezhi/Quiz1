package com.johnabbott.librarySystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johnabbott.librarySystem.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public List<Book> getComputerBooks() {
		// TODO Auto-generated method stub
		List<Book> computerBooks = new ArrayList<Book>();
		computerBooks.add(new Book("Head First Java","Computer","Kathy Sierra and Bert Bates"));
		computerBooks.add(new Book("Thinking in Java","Computer","Bruce Eckel"));
		return computerBooks;
	}

	@Override
	public List<Book> getNovelBooks() {
		// TODO Auto-generated method stub
		List<Book> novelBooks = new ArrayList<Book>();
		novelBooks.add(new Book("Hari Poter","Novel","Roling"));
		novelBooks.add(new Book("The Red and the Black","Novel","Stendhal and Roger Gard"));
		return novelBooks;
	}

}
