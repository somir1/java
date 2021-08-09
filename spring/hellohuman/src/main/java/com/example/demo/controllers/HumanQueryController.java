package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanQueryController {
	
	@RequestMapping("/human")
	public String humanHome(@RequestParam(value="q", required = false) String nameQuery) {
		
		if(nameQuery == null){
			return "<h1>Whats your name?</h1>";
		}else {
			return String.format("<h1>Hello %s</h1> <br> <h2>Welcome to SpringBoot!</h2> <br> <a href='http://localhost:8080'>Go Back</a>", nameQuery);
		}
	}

}
