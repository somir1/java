package com.hossain.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hossain.dojosninjas.models.DojoCon;
import com.hossain.dojosninjas.models.NinjaCon;
import com.hossain.dojosninjas.services.DojosService;

@Controller
public class DojoController {

	//let the controller know about the services
	private final DojosService dojosService;
	
	//construcor
	public DojoController(DojosService dojosService) {
		this.dojosService = dojosService;
	}
	
	//List<model>
	@GetMapping("/")
	public String home(Model model, @ModelAttribute("dojoo")DojoCon dojoCon) {
		List<DojoCon> allDojo = this.dojosService.findAllDojo();
		model.addAttribute("allDojo",allDojo);
		return "index.jsp";
	}
	
	@PostMapping("/adddojo")
	public String addDojo(@Valid @ModelAttribute("dojoo")DojoCon dojoCon, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<DojoCon> allDojo = this.dojosService.findAllDojo();
			model.addAttribute("allDojo",allDojo);
			return "index.jsp";
		}
		else {
			this.dojosService.makeDojo(dojoCon);
		}
		return "redirect:/";
	}
	
	@GetMapping("/makeninja")
	public String ninjaHome(Model model, @ModelAttribute("ninjaninja")NinjaCon ninjaCon) {
		List<NinjaCon> allNinja = this.dojosService.findAllNinja();
		model.addAttribute("allNinja",allNinja);
		
		//pass list of all dojos for the drop down
		List<DojoCon> allDojo = this.dojosService.findAllDojo();
		model.addAttribute("allDojo",allDojo);
		
		return "make.jsp";
	}
	
	@PostMapping("/addninja")
	public String addDojo(@Valid @ModelAttribute("ninjaninja")NinjaCon ninjaCon, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<NinjaCon> allNinja = this.dojosService.findAllNinja();
			model.addAttribute("allNinja",allNinja);
			
			//dojo objects
			List<DojoCon> allDojo = this.dojosService.findAllDojo();
			model.addAttribute("allDojo",allDojo);
			return "make.jsp";
		}
		else {
			this.dojosService.makeNinja(ninjaCon);
		}
		return "redirect:/makeninja";
	}
	@GetMapping("/show/{id}")
	public String showdojowithNinja(@PathVariable("id")Long id, Model model) {
		DojoCon d = this.dojosService.getDojobyID(id);	
		model.addAttribute("dojo", d);
		return "show.jsp";
	}
}
