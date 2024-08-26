package com.ex.throwdemo;

public class ATM {

	public static void main(String[] args) throws Exception {
		System.out.println("welcome");
		Bank bank = new Bank();
		bank.withdraw(4000);
		System.out.println("Amount withdrawn successfully");
	}
}
