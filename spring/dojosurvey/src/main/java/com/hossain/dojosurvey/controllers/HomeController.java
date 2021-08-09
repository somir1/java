package com.hossain.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}

	@PostMapping("/results")
	public String result(@RequestParam("fullname") String fullname, @RequestParam("location") String location,
			@RequestParam("favlang") String favlang, @RequestParam("comment") String comment, Model model) {
		
		
		System.out.println(fullname);
		System.out.println(favlang);
		System.out.println(location);
		System.out.println(comment);
		
		model.addAttribute("name",fullname);
		model.addAttribute("loc",location);
		model.addAttribute("lang",favlang);
		model.addAttribute("comment",comment);
		return "result.jsp";
	}
}
