package com.Santana.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
	@RequestMapping("/")
	public String home(@RequestParam(value="q",required=false) String searchQuery) {
		if(searchQuery ==null) {
		return "<h1> Hello Human </h1>\n <p> Welcome to SpringBoot</p>";
		}else return String.format("<h1> Hello %s </h1> <a href ='http://localhost:8080'>Go Back</a>\n <p> Welcome to SpringBoot</p>", searchQuery);
	}

}
