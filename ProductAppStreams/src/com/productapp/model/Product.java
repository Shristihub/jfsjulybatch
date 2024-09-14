package com.productapp.model;

import java.time.LocalDate;

public class Product {

	private String productName;
	private double price;
	private Integer productId;
	private String category;// enum
	private LocalDate warrantyDate;
	private String brand;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, double price, Integer productId, String category, LocalDate warrantyDate,
			String brand) {
		super();
		this.productName = productName;
		this.price = price;
		this.productId = productId;
		this.category = category;
		this.warrantyDate = warrantyDate;
		this.brand = brand;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}
	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", productId=" + productId + ", category="
				+ category + ", warrantyDate=" + warrantyDate + ", brand=" + brand + "]";
	}
	
}
