package com.shristi.set;

import java.util.TreeSet;

public class HashEmp {

	public static void main(String[] args) {
//		HashSet<Employee> empset = new HashSet<>();
		TreeSet<Employee> empset = new TreeSet<>();
		empset.add(new Employee("Zeena", 1,"Admin"));
		empset.add(new Employee("anna",2, "HR"));
		empset.add(new Employee("Steve",3,"HR"));
		empset.add(new Employee("Steve",3,"Admin"));
		System.out.println();
		System.out.println(empset);
		System.out.println();
		for (Employee employee : empset) {
			System.out.println(employee);
		}
	}
}
