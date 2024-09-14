package com.productapp.client;

import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

public class Customer {

	public static void main(String[] args) {
		IProductService productService = new ProductServiceImpl();
		productService.getAll().forEach(System.out::println);
		
		
	}

}
