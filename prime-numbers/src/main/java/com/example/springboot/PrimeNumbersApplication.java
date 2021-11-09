package com.example.springboot;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeNumbersApplication implements CommandLineRunner {

	
	@Override
	public void run(String... args) throws Exception {
		
	}

	public static void main(String[] args) {
		SpringApplication.run(PrimeNumbersApplication.class, args);
	}

}
