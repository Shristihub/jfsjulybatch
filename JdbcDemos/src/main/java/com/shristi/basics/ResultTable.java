package com.shristi.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultTable {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jfsjulydb";
		String username = "root";
		String password = "root";
		String sql = "select * from employee";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery(sql);
		try (connection; statement; resultset) {
			// iterate thru the resultset
			while (resultset.next()) {
				String empName = resultset.getString("emp_name");
				int empId = resultset.getInt(2);
				String city = resultset.getString("city");
				System.out.println(empName + "\t" + empId + "\t" + city);
			}
		}
	}
}
