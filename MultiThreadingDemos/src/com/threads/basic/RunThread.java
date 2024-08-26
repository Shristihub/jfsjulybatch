package com.threads.basic;

class Runner implements Runnable{
	String name;
	public Runner(String name,int prior){
		Thread th = new Thread(this,name);
		this.name = name;
		th.setPriority(prior);
		th.start();
		System.out.println(th.getPriority());
	}
	@Override
	public void run() {
//		String n = Thread.currentThread().getName();
		System.out.println("Lucky day "+name);
	}
}
public class RunThread {
	public static void main(String[] args) {
//		Runner runner = new Runner();
//		Thread th = new Thread(runner,"pop");
//		th.start();
//		
//		Runner runner1 = new Runner();
//		Thread th1 = new Thread(runner,"Jo");
//		th1.start();
		
		Runner runner1 = new Runner("Pop1",Thread.MIN_PRIORITY+4);
		Runner runner2 = new Runner("Pop2",Thread.MIN_PRIORITY+4);
		Runner runner3 = new Runner("Pop3",Thread.MIN_PRIORITY+4);
		
		
	}

}
