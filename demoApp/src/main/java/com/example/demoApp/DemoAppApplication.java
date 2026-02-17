package com.example.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// "3 annotation is bundled in this one annotation"
//1. @Configuration
//2. @ComponentScan
//3. @EnableAutoConfiguration
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

}
