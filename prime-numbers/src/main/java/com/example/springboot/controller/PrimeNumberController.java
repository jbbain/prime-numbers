package com.example.springboot.controller;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.PrimeNumbers;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class PrimeNumberController {
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/primenumbers/{number}")
	public List<Integer> getPrimeN(@PathVariable int number) {
		PrimeNumbers p = new PrimeNumbers();
		return p.primeNumberResults(number);		
	}
	
}
