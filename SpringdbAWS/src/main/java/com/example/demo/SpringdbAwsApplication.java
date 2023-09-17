package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdbAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdbAwsApplication.class, args);
		
		System.out.println("Aws connected Springboot ... ");
	}

}
