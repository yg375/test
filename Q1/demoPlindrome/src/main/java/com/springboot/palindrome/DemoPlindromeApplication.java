package com.springboot.palindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.palindrome.controller")
public class DemoPlindromeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoPlindromeApplication.class, args);
	}

}
