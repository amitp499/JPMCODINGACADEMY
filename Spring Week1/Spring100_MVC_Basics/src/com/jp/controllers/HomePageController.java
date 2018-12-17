package com.jp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	
	
	@RequestMapping("/homePage")
	public String getHomePage(){
		
		System.out.println("in home page");
		
		return "/homePage.jsp";
	}

}
