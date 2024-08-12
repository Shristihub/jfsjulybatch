package com.inter.lamb;

class Manager implements IAllowance{

	@Override
	public void calculateAllow(double amount) {
		System.out.println("Allowance for manager");
		System.out.println("Allowance "+(amount *2));
	}
	
}


public class TrialOne {
 public static void main(String[] args) {
	Details  details = new Details();
	IAllowance manager = new Manager();
	details.printAllowance(manager, 20000);
	
	System.out.println();
	// lambda expressions
	
	IAllowance dev = amount->{
		System.out.println("Dev allowance");
		System.out.println("Allowance "+(amount *3));
	};
	System.out.println("Starting");
	details.printAllowance(dev, 2000);
	
	System.out.println();
	
	details.printAllowance
	(amount->System.out.println("Support allowance"+(amount *3)),3000);
	
}
}
