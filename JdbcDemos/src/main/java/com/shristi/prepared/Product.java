package com.shristi.prepared;

public class Product {
	private String productName;
	private float price;
	private Integer productId;
	private String brand;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, float price, Integer productId, String brand) {
		super();
		this.productName = productName;
		this.price = price;
		this.productId = productId;
		this.brand = brand;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", productId=" + productId + ", brand="
				+ brand + "]";
	}
	

}
