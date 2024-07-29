package com.oops.inher;

public class InManager extends InEmployee {
	double salary;
	
	public InManager(String empName, int empId, double salary) {
		super(empName, empId);
		this.salary = salary;
	}

	void calcBonus(int amount) {
		System.out.println(salary+amount);
	}

	
	
	
}
