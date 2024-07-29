package com.oops.inher;

public class InherMain {

	public static void main(String[] args) {
		InEmployee employee = new InEmployee("Raj",20);
		employee.printDetails();
		
		InManager manager = new InManager("Ram",30,2000);
		manager.printDetails();
		manager.calcBonus(100);
	}
}
