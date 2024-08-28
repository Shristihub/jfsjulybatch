package com.threads.concurrency;

class Tech implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Great day");
	}
	
}
public class OldThreadDemo {

	public static void main(String[] args) {
		Thread thread = new Thread(new Tech(),"techy");
		thread.start();
		
		new Thread(()->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Great day");
		},"Poppy").start();
		
	}
}
