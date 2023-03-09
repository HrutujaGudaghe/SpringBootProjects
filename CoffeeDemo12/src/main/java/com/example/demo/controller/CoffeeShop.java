package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Coffee;

//Import required Java and Spring Boot classes


//Define a REST controller for handling coffee requests
@RestController

public class CoffeeShop {
	// Define a list of coffee objects
		private List<Coffee> coffee = new ArrayList<>();
		
		// Constructor to populate the coffee list
	public CoffeeShop() 
	{
		coffee.addAll(List.of(
				new Coffee("Starbucks",500.00),
				new Coffee("Nescafe",150.00),
				new Coffee("Bourburn",200.30),
				new Coffee("Nestle",80.00),
				new Coffee("Bru",100.00)
				
				));
	}
	@GetMapping("/coffee")
		Iterable<Coffee> getAllCoffee(){
			return coffee;
		
	    }
	}


