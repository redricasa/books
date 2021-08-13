package com.rica.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rica.books.models.Book;
import com.rica.books.repositories.BookRepository;
//collection of functions that can be reused
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
//    generate constructor using fields
    public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    public Book updateBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
//  updates a book - API
//    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
////    	use the setter methods from the domain model- Book.java
//    	Book b = findBook(id);
//    	b.setTitle(title);
//    	b.setDescription(desc);
//    	b.setLanguage(lang );
//    	b.setNumberOfPages(numOfPages);
//        return bookRepository.save(b);
//    }
    
//    deletes a book by id - doesn't return anything
	public void deleteById(Long id) {
		Optional<Book> optionalDeleteBook = bookRepository.findById(id);
        if(optionalDeleteBook.isPresent()) {
        	bookRepository.deleteById(id);
        } 
		
	}
}
