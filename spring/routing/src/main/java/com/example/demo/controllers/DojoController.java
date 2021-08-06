package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//dojo
//burbank-dojo
//san-jose

@RestController
public class DojoController {
	
	@RequestMapping("/dojo")
	public String dojo() {
		return "The dojo is awesome";
	}
	
	@RequestMapping("/{dojoLocation}")
	public String location(@PathVariable("dojoLocation") String dojoLocation) {
		if(dojoLocation.equals("burbank")) {
			return "Burbank Dojo is located in Southern California.";
		}else if (dojoLocation.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}else return "I dont believe that location exits";
	}

}
