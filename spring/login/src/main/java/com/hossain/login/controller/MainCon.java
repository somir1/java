package com.hossain.login.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hossain.login.models.LoginUser;
import com.hossain.login.models.User;
import com.hossain.login.services.UserService;

@Controller
public class MainCon {

	 @Autowired // means you dont have initizize or make a loaded contructor
	    private UserService userService;
	    
		@GetMapping("/")
		public String home(Model model) {
		// makes a new instance for the user
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		
	    @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        User user = userService.login(newLogin, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            return "index.jsp";
	        }
	        session.setAttribute("user_id", user.getId());
	        return "redirect:/home";
	    }
		
		 @PostMapping("/register")
		    public String register(@Valid @ModelAttribute("newUser") User newUser, 
		            BindingResult result, Model model, HttpSession session) {
		        userService.register(newUser, result);
		        if(result.hasErrors()) {
		            model.addAttribute("newLogin", new LoginUser());
		            return "index.jsp";
		        }
		        session.setAttribute("user_id", newUser.getId());
		        return "redirect:/home";
		    }
		 
		 @GetMapping("/home")
		 public String loggedin(HttpSession session, Model model, RedirectAttributes redirectAttributes) {
			 if(session.getAttribute("user_id") == null) {
		    		redirectAttributes.addFlashAttribute("problem", "You must be logged in.");
		    		return "redirect:/";
		    	}
		    	User user = this.userService.getUserById((Long)session.getAttribute("user_id"));
		    	model.addAttribute("user", user);
		    	return "home.jsp";
		 }
		 
		    @GetMapping("/logout")
		    public String logout(HttpSession session) {
		    	session.removeAttribute("user_id");
		    	return "redirect:/";
		    }
}

