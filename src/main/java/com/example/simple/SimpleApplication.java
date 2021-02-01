package com.example.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleApplication {
	
	@GetMapping("/hello")
	public String getName() {
		return "hello this is harsha";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}

}
