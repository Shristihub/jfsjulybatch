package com.productapp.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.productapp.model.Category;
import com.productapp.model.Product;

public class ProductUtil {
	
	

	public static List<Product> getProducts(){
		String elect = Category.ELECTRONICS.name();
		String mobile = Category.MOBILES.name();
		String sports = Category.SPORTS.name();
		String stat = Category.STATIONARY.name();
		String home = Category.HOMEAPPLIANCES.name();
		
		
		return Arrays.asList(
				new Product("Mobile", 20000, 1,mobile , LocalDate.of(2025, 2,20), "Samsung"),
				new Product("Mobile", 35000, 2,mobile , LocalDate.of(2024, 12,12), "OnePlus"),
				new Product("Laptop", 20000, 3,elect , LocalDate.of(2024, 12,30), "Dell"),
				new Product("Football", 2000, 4,sports , LocalDate.of(2025, 3,14), "Nike"),
				new Product("Bat", 12000, 5,sports , LocalDate.of(2025, 2,20), "Nike"),
				new Product("Basket Ball", 20000, 6,sports , LocalDate.of(2024,5,10), "Nike"),
				new Product("Television", 200000, 7,home , LocalDate.of(2024,5,10), "Samsung"),
				new Product("Washing Machine", 45000, 8,home , LocalDate.of(2024,5,10), "Samsung"),
				new Product("Sneakers", 4200, 9,sports , LocalDate.of(2024,7,16), "Adidas"),
				new Product("Shoes", 5200, 10,mobile , LocalDate.of(2024,10,16), "Puma"),
				new Product("Pencils", 100, 11,stat , LocalDate.of(2024,8,11), "Classmate"),
				new Product("Notebooks", 200, 12,stat , LocalDate.of(2024,9,16), "Classmate")
				);
	}
}
