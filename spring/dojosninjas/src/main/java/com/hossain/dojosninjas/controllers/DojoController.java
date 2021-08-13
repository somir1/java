package com.hossain.dojosninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DojoController {

	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
}
