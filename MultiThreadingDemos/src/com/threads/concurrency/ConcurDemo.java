package com.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
//		task -1
		Runnable runner = ()->{
			System.out.println("Task-1");
		};
//		task-2
		Runnable runner1 = ()->{
			System.out.println("Task 2");
		};
		executorService.execute(runner);
//		executorService.execute(runner1);
		executorService.execute(()->{
			System.out.println("Task 2");
		});
		executorService.shutdown();
	}

}
