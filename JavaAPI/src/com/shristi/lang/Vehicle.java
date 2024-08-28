package com.shristi.lang;

import java.util.Objects;

public class Vehicle implements Cloneable{

	private String model;
	private String brand;
	private double price;
//	private Engine engine;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	protected Vehicle clone() throws CloneNotSupportedException {
		System.out.println("cloning...");
		return (Vehicle)super.clone();
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(model, other.model);
	}	
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
	
}
