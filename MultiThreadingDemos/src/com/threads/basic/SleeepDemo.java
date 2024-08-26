package com.threads.basic;

public class SleeepDemo {

	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		System.out.println(th);
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+" * 2 = "+i*2);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
