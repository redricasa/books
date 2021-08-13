package com.rica.books.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rica.books.models.Book;
import com.rica.books.services.BookService;

@Controller
public class BooksController {
	private final BookService bookService;

	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}
//	READ, show all books
	@RequestMapping("/books")
	public String showAll(Model model) {
		List<Book> books  = bookService.allBooks();
		model.addAttribute("books", books );
		return "/books/index.jsp";
	}
//	READ ONE-
	@RequestMapping("/books/{id}")
    public String showOne(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
        return "/books/show.jsp";
    }
//	
	@RequestMapping("/books/new")
    public String newBookForm(@ModelAttribute("book") Book book) {
        return "/books/new.jsp";
    }
//	CREATE an empty book will be instantiated and bound to our view model. validates and binds
    @RequestMapping(value="/books", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
//    	System.out.println("inside create method");
        if (result.hasErrors()) {
            return "/books/new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/books";
        }             
    }
    
    
    
    
  
//   UPDATE to database
    @RequestMapping(value="/books/{id}/update", method=RequestMethod.PUT )
    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
    	if (result.hasErrors()) {
            return "/books/edit.jsp";
        } else {
            bookService.updateBook(book);
            return "redirect:/books";
        }                               
    }
    
//   EDIT
    @RequestMapping("/books/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
    	Book book  = bookService.findBook(id);
    	model.addAttribute("book", book);
    	return "/books/edit.jsp";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//  DELETE 
    @RequestMapping(value="/books/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
        bookService.deleteById(id);
        return "redirect:/books";
    }
}
