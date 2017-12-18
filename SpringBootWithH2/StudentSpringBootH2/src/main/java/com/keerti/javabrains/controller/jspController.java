package com.keerti.javabrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.keerti.javabrains.service.LoginService;
import com.keerti.javabrains.service.TopicService;

@Controller
public class jspController {


	@Autowired
	private LoginService loginService;
	

	@RequestMapping("/hi")
	public String hello(){
		return "Hello";
	}
	
	@RequestMapping("/index")
	public String helloJsp(Model model,@RequestParam (value="name", required=false, defaultValue="World") String name) {
		model.addAttribute("name", name);
		return "index";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model){
        return "login";
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/login")
	public String login(ModelMap modelMap,@RequestParam String email, @RequestParam String password) {
		boolean isValidUser= loginService.validateUser(email, password);
		 if (!isValidUser) {
	            modelMap.put("errorMessage", "Invalid Credentials");
	            return "login";
	        }
		modelMap.put("email", email);
		modelMap.put("password", password);
		return "welcome";
	}
	
}
