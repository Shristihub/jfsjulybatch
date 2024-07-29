package com.oops.basics;

public class Employee {

	String employeeName;
	int employeeId;
	
	Employee(String employeeName,int employeeId){
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	
	void printDetails() {
		System.out.println("Name " + employeeName);
		System.out.println("Id " + employeeId);

	}
	
	String greetMessage(String message) {
		return message + employeeName;
	}
}
