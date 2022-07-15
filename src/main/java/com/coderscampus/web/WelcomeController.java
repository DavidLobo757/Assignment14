package com.coderscampus.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.coderscampus.domain.User;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public String getWelcome (ModelMap model) {
		User user = new User();
		
		model.put("user", user);
		return "redirect:/welcome";
		
	}
}
