package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SpringController {
	/*
	 * Pass the pageName=some value in url
	 * localhost:8080/showPage?pageName=Balakrishna
	 * This is by using ModelAndView and @RequestParam
	 */
	@RequestMapping("/showPage")
	public ModelAndView showPage(@RequestParam("pageName") String pageName) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("pageName", pageName);
		mv.setViewName("secondPage");
		return mv;
	}

}
