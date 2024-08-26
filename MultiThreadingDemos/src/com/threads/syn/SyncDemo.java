package com.threads.syn;

class Counter implements Runnable{
    private String name;
    private double amount;
    private LoanCalculator loanCalculator;
    
	public Counter(String name, double amount,LoanCalculator loanCalculator) {
		this.name = name;
		this.amount=amount;
	    this.loanCalculator = loanCalculator;	
		Thread th = new Thread(this,name);
		th.start();
//		System.out.println(th);
	}

	@Override
	public void run() {
		synchronized (loanCalculator) {
			System.out.println("Welcome "+name);
			double interest = loanCalculator.calculateInterest(name, amount);
			System.out.println("Interest calculated for"+name+" " + interest);
		}
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		LoanCalculator loan = new LoanCalculator();
		Counter counter1 = new Counter("Ram",50000.0,loan);
		Counter counter2 = new Counter("Jo",145000.0,loan);
		Counter counter3 = new Counter("Ronnie",320000.0,loan);
	}
}
