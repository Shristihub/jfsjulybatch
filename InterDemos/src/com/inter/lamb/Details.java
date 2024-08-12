package com.inter.lamb;

public class Details {
  void printAllowance(IAllowance obj,double amount) {
	  System.out.println("Printing allowance of employee");
	  obj.calculateAllow(amount);
	  System.out.println("Work done");
  }
}
