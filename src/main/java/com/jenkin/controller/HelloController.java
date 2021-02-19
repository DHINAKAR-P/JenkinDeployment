package com.jenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

	@GetMapping(path = "/sayhello") //,method = RequestMethod.GET,produces = "text/plain",consumes = "text/plain"
	public String sayHello() {
		return "Hello, I am web service Deployed Via Jenkin";
	}
	
}
