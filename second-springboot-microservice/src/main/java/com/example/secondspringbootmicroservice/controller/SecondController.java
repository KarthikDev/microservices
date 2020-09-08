package com.example.secondspringbootmicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	
	@GetMapping("/secondapi")
	public String greeting() {		
		return "Hello!! You are here -> second-springboot-microservice";
	}

}
