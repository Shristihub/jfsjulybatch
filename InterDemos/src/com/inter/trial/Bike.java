package com.inter.trial;

public class Bike extends Vehicle {
	String capacity;

	public Bike(String model, double price, String brand, String capacity) {
		super(model, price, brand);
		this.capacity = capacity;
	}

	@Override
	public void coverageDetails() {
		System.out.println("covergae for engine and human");
	}

	@Override
	void getMileage() {
		System.out.println("mileage is ok");
	}
	// own method
	void showCategory() {
		if (capacity.equals("1000cc"))
			System.out.println("Terrain Bike");
		else if (capacity.equals("500cc"))
			System.out.println("Sports Bike");
		else
			System.out.println("Regular Bike");
	}

}
