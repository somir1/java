package com.hossain.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {

	@GetMapping("/")
	public String home(HttpSession session) {
		System.out.println("blahhh");
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		}
		else {
			session.setAttribute("count", (int) session.getAttribute("count") + 1);
		}
		return "index.jsp";
	}
	
	@GetMapping("/results")
	public String count(HttpSession session, Model model) {
		model.addAttribute("count",(int) session.getAttribute("count"));
		return "result.jsp";
	}
	
	@GetMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/";
	}
	
}
