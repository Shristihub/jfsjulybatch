package com.shristi.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class InsertTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjulydb";
		String username="root";
		String password="root";
		String sql = """
				  insert into employee values('Raju',1,'Bengaluru')
			      """;
		
		try(Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();){
		boolean isCreated =	statement.execute(sql);
		System.out.println("Table created "+!isCreated);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
