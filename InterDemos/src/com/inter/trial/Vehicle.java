package com.inter.trial;

public abstract class Vehicle implements IInsurance{

	private String model;
	private double price;
	private String brand;
	public Vehicle(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	
	void printDetails() {
		System.out.println("Model "+model+"\nBrand "+brand+"\nPrice "+price);
	}
	abstract void getMileage();
}
