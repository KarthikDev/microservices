package com.example.firstspringbootmicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/firstapi")
	public String greeting() {		
		return "Hello!! You are here -> first-springboot-microservice";
	}

}
