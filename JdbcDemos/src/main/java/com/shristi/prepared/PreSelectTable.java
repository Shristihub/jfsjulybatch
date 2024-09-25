package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PreSelectTable {
	public static void main(String[] args)  {
		String url = "jdbc:mysql://localhost:3306/jfsjulydb";
		String username="root";
		String password="root";
		String sql = "select * from product";
				
		//exception is handled, and also resources are auto closed
		try(Connection connection = DriverManager.getConnection(url, username, password);
		    PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
				){		
			List<Product> products = new ArrayList<>();
			while (rs.next()) {
				int productId  = rs.getInt("product_id");
				String productName  = rs.getString("product_name");
				float price  = rs.getFloat("price");
				String brand = rs.getString("brand");
//				System.out.println(productId+"\t"+productName+"\t"+brand+"\t"+price);
				Product product = new Product(productName, price, productId, brand);
//				System.out.println(product);
				products.add(product);
			}
			
			products.stream()
			        .sorted((p1,p2)->p1.getProductName().compareTo(p2.getProductName()))
					.forEach(System.out::println);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
