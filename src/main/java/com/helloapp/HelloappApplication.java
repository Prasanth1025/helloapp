package com.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloappApplication {

	public static void main(String[] args) {
		System.out.println("Hello World First SpringBoot Application");
		SpringApplication.run(HelloappApplication.class, args);
	}

}
