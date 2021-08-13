package com.rica.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rica.books.models.Book;

//proxy class created
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findAll();//SELECT * FROM books;
	List<Book> findByDescriptionContaining(String search);//SELECT * FROM books WHERE description = LIKE '%?%'
	Long countByTitleContaining(String search);//SELECT count(*) LIKE 
	Long deleteByTitleStartingWith(String search);//DELETE FROM books WHERE title LIKE '?%'
	
}
