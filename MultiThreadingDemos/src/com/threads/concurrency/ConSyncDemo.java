package com.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.threads.syn.LoanCalculator;

class Task implements Runnable{
    private String name;
    private double amount;
    private Loan loan;
    
    public Task(String name, double amount,Loan loan) {
		this.name = name;
		this.amount=amount;
	    this.loan = loan;	
	}
	@Override
	public void run() {
		synchronized (loan) {
			System.out.println("Welcome "+name);
			double interest = loan.calculateInterest(name, amount);
			System.out.println("Interest calculated for"+name+" " + interest);
		}
	}
}

public class ConSyncDemo {

	public static void main(String[] args) {
		Loan loan = new Loan();
		// ask executors to create a pool of threads
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(new Task("Ram",50000.0,loan));
		executorService.execute(new Task("Kevin",150000.0,loan));
		executorService.execute(new Task("Arav",550000.0,loan));
		executorService.execute(()->{
			loan.payBills(2000);
		});
		executorService.shutdown();
		
	}
}






