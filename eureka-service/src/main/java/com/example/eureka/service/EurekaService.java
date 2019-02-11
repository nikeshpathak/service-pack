package com.example.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/eureka-service")
public class EurekaService {

	public static void main(String[] args) {
		SpringApplication.run(EurekaService.class, args);
	}


	@GetMapping
	public String getMessage() {
		return "Hello World";
	}
}


