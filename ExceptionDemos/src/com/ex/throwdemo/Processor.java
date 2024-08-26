package com.ex.throwdemo;

public class Processor {

	void check(int x) throws Exception{
		System.out.println("processing");
		try {
			if(x<10)
				throw new Exception("the value of x is less");
		} catch (Exception e) {
			System.out.println("exception...");
			throw e;
		}finally {
			System.out.println("close db");
		}
		System.out.println("completed");
	}
}
