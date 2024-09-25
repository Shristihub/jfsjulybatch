package com.productapp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.productapp.exception.IdNotFoundException;
import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.util.ProductUtil;

public class ProductServiceImpl implements IProductService{
	 static List<Product> products;
	 static {
		 products = ProductUtil.getProducts();
	 }

	@Override
	public List<Product> getAll() {
		return products;
	}

	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByCategory(String category) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByBrandBeforeWarranty(String brand, LocalDate date) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(int productId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getByBrandPrice(String brand, double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getByProductNames(String productName) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getByLesserPrice(String category, double price) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountByBrand(String brand) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotalPriceBrand(String brand) throws ProductNotFoundException {
		double sum =  products.stream()
		       .filter(product->product.getBrand().equals(brand))
		       .mapToDouble(Product::getPrice)
		       .sum();
		if(sum<=0)
			throw new ProductNotFoundException("brand not found");
		return sum;
	}

	@Override
	public Map<String, List<Product>> getAllByCategory(String category) throws ProductNotFoundException {
		return products.stream()
	       .filter(product->product.getCategory().equals(category))
	       .collect(Collectors.toMap(Product::getBrand,product->{
	    	   List<Product> products = new ArrayList<Product>();
	    	   products.add(product);
	    	   return products;
	       }));
	}

	@Override
	public Map<LocalDate, String> getWarrantyByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

}
