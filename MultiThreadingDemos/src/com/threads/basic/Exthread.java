package com.threads.basic;

class Child extends Thread{
	
	public Child(String name,int priority) {
		super(name);
		this.setPriority(priority);
		this.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i+" * 2 = "+i*2);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class Exthread {

	public static void main(String[] args) {
//		Child child=  new Child();
//		//set name
//		child.setName("Child-0");
//		// start the thread
//		child.start();
//		Child child1=  new Child();
//		//set name
//		child1.setName("Child-1");
//		// start the thread
//		child1.start();
		
		Child child =  new Child("ch-0",Thread.MIN_PRIORITY+2);
		Child child1=  new Child("ch-1",Thread.MAX_PRIORITY-2);
		
		
		
		
	}
}
