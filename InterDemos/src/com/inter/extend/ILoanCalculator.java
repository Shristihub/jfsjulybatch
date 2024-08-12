package com.inter.extend;

public interface ILoanCalculator {

	void calculate(double amount);
	default void printDetails() {
		System.out.println("Printing loan details");
	}
}
