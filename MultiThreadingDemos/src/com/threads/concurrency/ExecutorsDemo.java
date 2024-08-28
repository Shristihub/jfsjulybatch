package com.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {

	public static void main(String[] args) {
		// ask executors to create a pool of threads
		ExecutorService executorService = Executors.newFixedThreadPool(2);
//		// execute the tasks
//		for (int i = 0; i < 2000; i++) {
//			executorService.execute(
//					()->{
//						try {
//							System.out.println("Great day "+ Thread.currentThread().getName());
//							Thread.sleep(10000);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					  
//		            }
//		);
//	}
		// old way
		for (int i = 0; i < 10; i++) {
			new Thread(() -> System.out.println("Great day " + Thread.currentThread().getName()), "pop" + i).start();

		}

		System.out.println();
		// with executors
		for (int i = 0; i < 10; i++) {
			executorService.execute(() -> System.out.println("Welcome " + Thread.currentThread().getName()));

		}
	}

}
