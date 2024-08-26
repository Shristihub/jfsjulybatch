package com.ex.throwdemo;

public class Bank {

	void withdraw(int amount)throws Exception {
		System.out.println("In Bank");
		try {
			if(amount>2000)
				throw new Exception("exceeded limit");
//			System.out.println("am "+amount);
//		} catch (Exception e) {
//			System.out.println("error "+e.getMessage());
		} finally {
			System.out.println("closing....");
		}
		System.out.println("work done");

	}
}
