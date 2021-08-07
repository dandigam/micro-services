package com.dandigam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	
	@GetMapping
	public String getMessage() {
		return "Welcome to Spring boot";
	}
	
	@GetMapping
	public String getMessage1() {
		
		return "Welcome to Spring boot";
	}

}
