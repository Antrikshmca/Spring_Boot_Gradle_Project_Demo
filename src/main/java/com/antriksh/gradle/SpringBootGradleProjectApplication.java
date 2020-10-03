package com.antriksh.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootGradleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGradleProjectApplication.class, args);
		System.out.println("Welcome to gradle project");
	}

}
