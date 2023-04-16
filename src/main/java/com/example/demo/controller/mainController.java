package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

	@GetMapping("/welcome")
	public String home() {
		System.out.println("requested welcome jsp page");
		return "welcome";
	}
	
	@GetMapping("/login")
	public String login() {
		System.out.println("requested login jsp page");
		return "login";
	}
}
