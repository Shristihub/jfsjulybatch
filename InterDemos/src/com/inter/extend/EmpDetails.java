package com.inter.extend;

public class EmpDetails implements IBonusCalculator, ILoanCalculator {
	@Override
	public void calculate(double amount) {
		System.out.println("calculating..."+(amount*2));
	}
	@Override
	public void printDetails() {
		System.out.println("printing emp details");
		ILoanCalculator.super.printDetails();
		IBonusCalculator.super.printDetails();
	}

	

}
