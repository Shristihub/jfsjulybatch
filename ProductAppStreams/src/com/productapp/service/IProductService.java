package com.productapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.productapp.exception.IdNotFoundException;
import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductService {

	List<Product> getAll();
	List<Product> getByBrand(String brand) throws ProductNotFoundException;
	List<Product> getByCategory(String category)throws ProductNotFoundException;
	List<Product> getByBrandBeforeWarranty(String brand,LocalDate date)throws ProductNotFoundException;
	Product getById(int productId)throws IdNotFoundException;
	List<String> getByBrandPrice(String brand,double price)throws ProductNotFoundException; // only produtcNames
	List<String> getByProductNames(String productName)throws ProductNotFoundException; //return only brands
	List<String> getByLesserPrice(String category,double price)throws ProductNotFoundException; 
	int getCountByBrand(String brand)throws ProductNotFoundException;
	double getTotalPriceBrand(String brand)throws ProductNotFoundException;
	//samsung list of items
	//dell list of items
	Map<String,List<Product>> getAllByCategory(String category)throws ProductNotFoundException;
	
	//date1 mobile
	//date2,laptop
	Map<LocalDate,String>getWarrantyByBrand(String brand);
	
	
	
	
}
