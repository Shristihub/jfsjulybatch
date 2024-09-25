package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreInsertTable {
	public static void main(String[] args)  {
		String url = "jdbc:mysql://localhost:3306/jfsjulydb";
		String username="root";
		String password="root";
		String sql = "insert into product(product_name, brand, price) values(?,?,?)";
				
		//exception is handled, and also resources are auto closed
		try(Connection connection = DriverManager.getConnection(url, username, password);
		PreparedStatement statement = connection.prepareStatement(sql)){		
			// set values for placeholder
			statement.setString(1,"Television");
			statement.setString(2, "Samsung");
			statement.setDouble(3, 120000);
			//call execute to execute the query
			System.out.println(!statement.execute());
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
