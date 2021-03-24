package com.springboot.bits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.bits.controller")
public class DemoBitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBitsApplication.class, args);
	}

}
