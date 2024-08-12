package com.oops.basics;

import java.util.Properties;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee("Sri",10);
		
		employee.printDetails();
		String result = employee.greetMessage("Have a great day");
		System.out.println(result);

		Employee employee1 = new Employee("Joe",20);
		
		employee1.printDetails();
		System.out.println(employee1.greetMessage("Good day "));
		
		String res = System.getenv("hostname");
		System.out.println(res);
		
		Properties prop = System.getProperties();
		String username = prop.getProperty("username");
		System.out.println(username);
	}

}
