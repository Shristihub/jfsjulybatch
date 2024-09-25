package com.shristi.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class CreateTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jfsjulydb";
		String username="root";
		String password="root";
		String sql = "create table employee(emp_name varchar(20),empId int primary key,city varchar(20))";
//		String sql ="drop table employee";
		try(Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();){
		boolean isCreated =	statement.execute(sql);
		System.out.println("Table created "+!isCreated);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
