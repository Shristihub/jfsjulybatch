package com.inter.extend;

public interface IBonusCalculator {

	void calculate(double amount);
	default void printDetails() {
		System.out.println("Printing bonus details");
	}
	
}
