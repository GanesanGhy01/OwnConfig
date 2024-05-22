package com.security.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OwnconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(OwnconfigApplication.class, args);
		System.out.println("own security");
	}

}
