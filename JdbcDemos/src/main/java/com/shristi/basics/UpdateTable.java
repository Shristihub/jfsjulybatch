package com.shristi.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jfsjulydb";
		String username = "root";
		String password = "root";
		
		String sql = "update employee set city='ooty' where empid=1";
		
		try (Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		                                            ) {
		int updatedCount =  statement.executeUpdate(sql);
		System.out.println(updatedCount);	
		
		}
	}
}
