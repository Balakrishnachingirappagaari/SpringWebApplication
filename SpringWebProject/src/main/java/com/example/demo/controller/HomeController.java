package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	/*
	 * sending data to jsp using session  or https req 
	 */
	@RequestMapping("/home")
	public String showHome(String name,HttpSession session) {		
	System.out.println("hello::"+name);
	session.setAttribute("name", name);
		return "welcome";
	}

}
