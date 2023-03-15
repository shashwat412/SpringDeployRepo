package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureRepoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureRepoDemoApplication.class, args);
	}
	
	@GetMapping("/demo")
	public String retString()
	{
		return "EMPOn";
	}

}
