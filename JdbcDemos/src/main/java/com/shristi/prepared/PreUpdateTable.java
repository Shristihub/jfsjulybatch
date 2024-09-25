package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreUpdateTable {
	public static void main(String[] args)  {
		String url = "jdbc:mysql://localhost:3306/jfsjulydb";
		String username="root";
		String password="root";
		String sql = "update product set price=? where product_id=?";
				
		//exception is handled, and also resources are auto closed
		try(Connection connection = DriverManager.getConnection(url, username, password);
		PreparedStatement statement = connection.prepareStatement(sql)){		
			statement.setDouble(1, 220);
			statement.setInt(2, 7);
			System.out.println("updated count "+statement.executeUpdate());
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
