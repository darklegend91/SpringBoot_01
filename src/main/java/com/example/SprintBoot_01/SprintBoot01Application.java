package com.example.SprintBoot_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintBoot01Application {
	public static void main(String[] args) {
		SpringApplication.run(SprintBoot01Application.class, args);
		System.out.println("Hello Spring!!!");
	}
}