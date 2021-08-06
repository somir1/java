package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanQueryController {
	
	@RequestMapping("/human")
	public String humanHome(@RequestParam(value="q", required = false) String nameQuery) {
		
		if(nameQuery == null){
			return "Whats your name?";
		}else {
			return "Hello " + nameQuery + " Welcome to SpringBoot";
		}
	}

}
