package com.ex.throwdemo;

public class Trial {

	public static void main(String[] args)throws Exception {
		Processor processor = new Processor();
		System.out.println("started");
//		try {
			processor.check(1);
			System.out.println("process over");
//		} catch (Exception e) {
//			System.out.println("error");
//		}
		
		System.out.println("done");
	}
}
