package edu.miu.cs.cs544.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String home() {
		return "Welcome to Spring Boot";
	}

}
