package com.oops.basics;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee = new Employee("Sri",10);
		
		employee.printDetails();
		String result = employee.greetMessage("Have a great day");
		System.out.println(result);

		Employee employee1 = new Employee("Joe",20);
		
		employee1.printDetails();
		System.out.println(employee1.greetMessage("Good day "));

	}

}
