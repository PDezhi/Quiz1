package com.johnabbott.librarySystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.librarySystem.model.Book;
import com.johnabbott.librarySystem.service.BookService;


@Controller
public class LibrarySystemController {

	@Autowired
	BookService service;

	@RequestMapping(value = "/getcomputerbook", method = RequestMethod.GET)
	public ModelAndView getComputerBookList() {
		ModelAndView modelView = new ModelAndView("computer-book-list");

		List<Book> computerBooks = service.getComputerBooks();
		modelView.addObject("computerbookList", computerBooks);
		
		return modelView;
	}

	@RequestMapping(value = "/getnovelbook", method = RequestMethod.GET)
	public ModelAndView getNovelBookList() {
		ModelAndView modelView = new ModelAndView("novel-book-list");

		List<Book> novelBooks = service.getNovelBooks();
		modelView.addObject("novelbookList", novelBooks);
		
		return modelView;
	}
}
