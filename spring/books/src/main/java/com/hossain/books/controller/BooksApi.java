package com.hossain.books.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hossain.books.models.Book;
import com.hossain.books.services.BookService;

@RestController
public class BooksApi {

	//let the controller know about the service
	private final BookService bookService;
	
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    
    //the controller will have requests which will talk to the service
    //get all books
    @RequestMapping("/api/books")
    public List<Book> index() {
        return this.bookService.allBooks();
    }
    
    //creating a book
    @RequestMapping(value="/api/create/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="numberOfPages") Integer numberOfPages) {
        Book book = new Book(title, desc, lang, numberOfPages);
        return this.bookService.createBook(book);
    }
    
    //return book by id
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    //delete the book
    @DeleteMapping("/api/books/delete/{id}")
    public void killbook(@PathVariable("id")Long id) {
    	this.bookService.kill(id);
    }
    
    //updatebook
    @PutMapping("/api/books/update/{id}")
    public Book update(@PathVariable("id")Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="numberOfPages") Integer numberOfPages) {
    	// get the book from the db with the id
    	Book b =this.bookService.findBook(id);
    	System.out.println(b.getId());
    	
    	//update the object by using getters and setter
    	b.setTitle(title);
    	b.setDescription(desc);
    	b.setLanguage(lang);
    	b.setNumberOfPages(numberOfPages);
    	
    	// send the updated object to service to update db
    	return this.bookService.bookUpdate(b);
    }
}
