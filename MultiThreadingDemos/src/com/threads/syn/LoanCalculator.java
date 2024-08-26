package com.threads.syn;

public class LoanCalculator {

	public double calculateInterest(String name,double amount) {
		System.out.println("welcome to ABC bank "+name);
		double interest = (amount*5*3)/100;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Interest for "+name +" is "+interest);
		return interest;
	}
}
