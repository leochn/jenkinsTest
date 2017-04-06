package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@RequestMapping("/hello") 
	@ResponseBody
	public String helloWorld(){
		return "helloWorld!";
	}
	
	@RequestMapping("/") 
	@ResponseBody
	public String helloIndex(){
		return "<h2>This is index page! +++++</h2>";
	}

}
