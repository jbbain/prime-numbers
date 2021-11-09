package com.example.springboot.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.PathVariable;


//Model for Prime Numbers

@Entity
@Table(name="primeNumbers")
public class PrimeNumbers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "number")
	private int number;
	
	
	public PrimeNumbers(int number){
		super();
		this.number = number;
	}	
	

	public PrimeNumbers() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	public List<Integer> primeNumberResults(@PathVariable int number) {
		boolean prime[] = new boolean[number + 1];
	    Arrays.fill(prime, true);
	    for (int p = 2; p * p <= number; p++) {
	        if (prime[p]) {
	            for (int i = p * 2; i <= number; i += p) {
	                prime[i] = false;
	            }
	        }
	    }
	    List<Integer> primeNumbers = new LinkedList<>();
	    for (int i = 2; i <= number; i++) {
	        if (prime[i]) {
	            primeNumbers.add(i);
	        }
	    }
		return primeNumbers;
	}
	

}
