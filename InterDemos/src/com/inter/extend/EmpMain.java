package com.inter.extend;

public class EmpMain {

	public static void main(String[] args) {
		ILoanCalculator lcalculator = new EmpDetails();
		lcalculator.calculate(1000);
		lcalculator.printDetails();
		System.out.println();
		IBonusCalculator bcalc = (IBonusCalculator)lcalculator;
		bcalc.calculate(10000);
		bcalc.printDetails();
	}
}
