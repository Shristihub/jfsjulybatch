package com.oops.inher;

public class InEmployee {
	String empName;
	int empId;
	
	public InEmployee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	void printDetails() {
		System.out.println("Name " + empName);
		System.out.println("Id " + empId);

	}
	

}
