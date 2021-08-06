package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {

	//coding
	@RequestMapping("/coding")
	public String Coding() {
		return "Hello Coding Dojo";
	}
	//coding/python
	@RequestMapping("/coding/python")
	public String python() {
		return "Pyhton and flask was awesome";
	}
	
	//coding/java
	@RequestMapping("/coding/java")
		public String java() {
			return "Java and spring is better (I will be the judge of that)";
	}
}
