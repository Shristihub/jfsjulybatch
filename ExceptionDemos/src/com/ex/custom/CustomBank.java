package com.ex.custom;

public class CustomBank {

	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) throws ExceedingLimitsException, NegativeBalanceException, Exception {
		System.out.println("In Bank");
		try {
			// if balance is negative throw NegBalanceException
			if (balance - amount <= 0) {
				throw new NegativeBalanceException("balance should not be negative");
			}
			// if amount>1000 throw ExceedingLimitsException
			if (amount > 1000) {
				throw new ExceedingLimitsException("amount should be less than 1000");
			}
			balance = balance - amount;
			System.out.println("done");
			System.out.println("balance " + balance);
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage());
			throw e;
		} catch (ExceedingLimitsException e) {
			System.out.println(e.getMessage());
			throw e;
		}finally {
			System.out.println("close db");
		}
		System.out.println("Server done");

		

	}

}
