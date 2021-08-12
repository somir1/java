package com.hossain.language.controllers;

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

import com.hossain.language.models.Lang;
import com.hossain.language.services.LangService;

@Controller
public class LangController {

	//hey controller we a got a service to use and import it
	private final LangService langService;
	
	public LangController(LangService langService) {
		this.langService = langService;
	}
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String getallLang(@ModelAttribute("Lang") Lang lang, Model model) {
		//calling the service to get the ojects and add it to the list
		List<Lang> allLang = this.langService.allLang();
		
		//Take the object and send it to the template
		model.addAttribute("allLang", allLang);
		
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String makeLang(@Valid @ModelAttribute("Lang")Lang lang, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Lang> allLang = this.langService.allLang();
			model.addAttribute("allLang",allLang);
			return "index.jsp";
		}
		this.langService.addLang(lang);
		return "redirect:/";
	
	}
	
	@GetMapping("/lang/delete/{id}")
	public String deleteLang(@PathVariable("id")Long id) {
		this.langService.killLang(id);
		return "redirect:/";
	}
	
	@GetMapping("/lang/edit/{id}")
	public String editLang(@PathVariable("id")Long id, Model model) {
		Lang l = this.langService.findLang(id);
		model.addAttribute("info", l);
		return "edit.jsp";
	}
	
	@PostMapping("/update/{id}")
	public String updateLang(@PathVariable("id") Long id,@Valid @ModelAttribute ("lang")Lang lang, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		this.langService.langUpdate(lang);
		return "redirect:/";
	}
	
	@GetMapping("/book/show/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Lang l = this.langService.findLang(id);
		model.addAttribute("show", l);
		return "show.jsp";
	}
}
