package com.tekbasic.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tekbasic.Bo.Book;
import com.tekbasic.repository.BookRepository;
@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookRepository br;
	@RequestMapping("/")
	public String home(Model m){
		System.out.println("Check index");
		return "index";
	}
	@RequestMapping("/add")
	public String showBookForm(Model m) {
		m.addAttribute("book", new Book());
		return "add";
	}
	@GetMapping("/addBook")
	public String bookForm(@ModelAttribute("book") Book book ) {
		return "addBook";
	}
	@PostMapping("/add")
	public String addBook(@ModelAttribute("book") Book book, Model m) {
		br.save(book);
		return "redirect:viewBook";
	}
	@GetMapping("/viewBook")
	public String viewBook(Model m){
		m.addAttribute("book",br.findAll());
		return "viewBook";
	}
}
