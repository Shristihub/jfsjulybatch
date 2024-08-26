package com.ex.custom;

public class CustomATM {
	public static void main(String[] args) {
		System.out.println("in ATM");
		CustomBank customBank = new CustomBank(8000);
		try {
			customBank.withdraw(1600);
			System.out.println("Amount withdrawn successfully");
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}catch (ExceedingLimitsException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Goodbye");
	}

}
