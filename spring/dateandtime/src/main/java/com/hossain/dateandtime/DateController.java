package com.hossain.dateandtime;


import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class DateController {


	@RequestMapping("/")
	public String Welcome() {
		return "index.jsp";
	}
	
	@RequestMapping("/showdate")
	public String Date(Model model) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter DateFor = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		model.addAttribute("today", DateFor.format(now));
		return "date.jsp";
	}
	
	@RequestMapping("/showtime")
	public String Time(Model model) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter DateFor = DateTimeFormatter.ofPattern("h:mm a");
		model.addAttribute("time", DateFor.format(now));
		return "time.jsp";
	}
}
