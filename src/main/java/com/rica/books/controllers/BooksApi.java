//package com.rica.books.controllers;
//
//import java.util.List;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.rica.books.models.Book;
//import com.rica.books.services.BookService;
//
//@RestController
//public class BooksApi {
//	private final BookService bookService;
////  generate constructor using fields
//	public BooksApi(BookService bookService) {
//		this.bookService = bookService;
//	}
//	// returns all the books
//	@RequestMapping("/api/books")
//	public List<Book> index(){
//		return bookService.allBooks();
//	}
//	
//	@RequestMapping("/books")
//    public String index(Model model) {
//        List<Book> books = bookService.allBooks();
//        model.addAttribute("books", books);
//        return "/books/index.jsp";
//    }
//	  // creates a book
//	@RequestMapping(value="/api/books", method=RequestMethod.POST)
//    public Book create(@RequestParam(value="title") String title, 
//    				@RequestParam(value="description") String desc, 
//    				@RequestParam(value="language") String lang, 
//    				@RequestParam(value="pages") Integer numOfPages) {
//        Book book = new Book(title, desc, lang, numOfPages);
//        return bookService.createBook(book);
//    }
//	  // retrieves a book
//    @RequestMapping("/api/books/{id}")
//    public Book show(@PathVariable("id") Long id) {
//        Book book = bookService.findBook(id);
//        return book;
//    }
////  updates a book 
//    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
//    public Book update(
//    			@PathVariable("id") Long id, 
//    			@RequestParam(value="title") String title, 
//    			@RequestParam(value="description") String desc, 
//    			@RequestParam(value="language") String lang, 
//    			@RequestParam(value="pages") Integer numOfPages) {
//        Book book = bookService.updateBook(id,title, desc, lang, numOfPages);
//        return book;
//    }
////  deletes a book by id
//    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
//    public void delete(@PathVariable("id") Long id) {
//        bookService.deleteById(id);
//    }
//}
