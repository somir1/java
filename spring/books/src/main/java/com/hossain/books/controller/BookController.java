package com.hossain.books.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hossain.books.models.Book;
import com.hossain.books.services.BookService;

@Controller
public class BookController {
	//tell controller about the service
	
	private final BookService bookService;
	
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    
    @RequestMapping("/")
    public String home() {
    	return "redirect:/books";
    }
    
    @RequestMapping("/books")
    public String getallBooks(Model model) {
    	List<Book> allBooks = this.bookService.allBooks();
    	
    	//model and send it to the template
    	model.addAttribute("allBooks", allBooks);
        return "index.jsp";
    }
    
    @GetMapping("/book/show/{id}")
    public String showBook(@PathVariable("id") Long id, Model model) {
    	//using the id from the route we can return the object with the same id
    	Book b = this.bookService.findBook(id);
    	model.addAttribute("bookShow", b);
    	return "show.jsp";
    }
    
    @GetMapping("/book/delete/{id}")
    public String killBook(@PathVariable("id") Long id) {
    	this.bookService.kill(id);
    	return "redirect:/";
    }
    
    @GetMapping("/create")
    public String makeBook(Model model){
    	Book b = new Book();
    	// need to match with form model attribute
    	model.addAttribute("book", b);
    	return "make.jsp";
    }
    
    @PostMapping("/addbook")
    //Valid will check validation requriments in our model
    public String makeBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
    	if(result.hasErrors()) {
    		return "make.jsp";
    	}
    	this.bookService.createBook(book);
    	return "redirect:/";
    }
    
}
