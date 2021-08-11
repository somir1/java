package com.hossain.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hossain.books.repositories.BookRepository;
import com.hossain.books.models.Book;

@Service
public class BookService {
	// adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    //create constructer
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // returns all the books
    public List<Book> allBooks() {
        return (List<Book>) this.bookRepository.findAll();
        
    }
    
    // creates a book
    public Book createBook(Book b) {
        return this.bookRepository.save(b);
    }
    
    // retrieves a book
    public Book findBook(Long id) {
    	
    	return this.bookRepository.findById(id).orElse(null);
    	//the long way
//        Optional<Book> optionalBook = bookRepository.findById(id);
//        if(optionalBook.isPresent()) {
//            return optionalBook.get();
//        } else {
//            return null;
//        }
    }
    
    //deletebyid
    public  void kill(Long id) {
    	this.bookRepository.deleteById(id);
    }
    
    //updatebyid
    public Book bookUpdate(Book b) {
    	return this.bookRepository.save(b);
    }
}
