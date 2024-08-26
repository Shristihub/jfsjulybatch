package com.threads.basic;

public class ThreadDemo {

	public static void main(String[] args) {

		Thread th = Thread.currentThread();
		System.out.println(th);
		th.setName("Poppy");
		th.setPriority(Thread.NORM_PRIORITY+2);
		System.out.println(th);
		int x =10/0;
		
	}

}
