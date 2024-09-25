package com.shristi.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertManyTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjulydb";
		String username="root";
		String password="root";
		
		try(Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		Scanner scanner = new Scanner(System.in);){
	    	// use a for loop for a count of 5
			// get values from scanner and
			// insert the values into the sql query
			String name="Sri";
			int id =2;
			String city="Chennai";

			//String sql = "insert into employee values('Raju',1,'Chennai')";
			String sql = "insert into employee values('"+name+"',"+id+",'"+city+"')";
				      	
			
			
			
		boolean isCreated =	statement.execute(sql);
		System.out.println("value inserted "+!isCreated);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
