package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreCreateTable {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jfsjulydb";
		String username="root";
		String password="root";
		String sql = 
				"""
				create table product(product_name varchar(20),
				           product_Id int primary key auto_increment,
				           brand varchar(20),
				           price float)""";
		//exception not handled, but resources are auto closed
		Connection connection = DriverManager.getConnection(url, username, password);
		PreparedStatement statement = connection.prepareStatement(sql);
		try(connection;statement){		
			System.out.println(statement.execute());
		}
				
	}

}
