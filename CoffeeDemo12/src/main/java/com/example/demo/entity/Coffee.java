package com.example.demo.entity;

public class Coffee {
	private String brand;
	private Double price;
	public Coffee(String brand, Double price) 
	{
		super();
		this.brand = brand;
		this.price = price;
	}

	public Coffee() 
	{
		super();// Calls the constructor of the superclass (Object)
		
	}

	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	public Double getPrice() 
	{
		return price;
	}
	public void setPrice(Double price) 
	{
		this.price = price;
	}
	//This is the toString() method, which returns a string representation of the object
	@Override
	public String toString() 
	{
		return "Coffee [brand=" + brand + ", price=" + price + "]";
	   }


}
