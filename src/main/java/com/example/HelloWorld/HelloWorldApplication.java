package com.example.HelloWorld;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
	
	@GetMapping("/now")
	public String now() {
		return "Hello, Current Date and time is : "+new Date().toString();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
