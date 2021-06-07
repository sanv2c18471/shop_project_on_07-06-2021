package com.marketshop.marketshop.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marketshop.marketshop.Entities.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String loginPage() {
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute(name = "user") User user, Model model) {
		String username = user.getUsername();
		String password = user.getPassword();

		if ("owner".equals(username) && "owner".equals(password)) {
			return "home";
		} else if ("employee".equals(username) && "employee".equals(password)) {
			return "billhome";
		} else {
			return "errorpage";
		}
	}	
		
		
		
	/*
	 * @RequestMapping(value="/login", method=RequestMethod.POST) public String
	 * login(@ModelAttribute(name="loginform") LoginForm loginForm,Model model) {
	 * String role=loginForm.getRole(); if("admin".equals(role)) {
	 * 
	 * } }
	 */
}
