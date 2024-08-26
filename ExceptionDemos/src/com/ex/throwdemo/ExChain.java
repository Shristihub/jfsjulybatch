package com.ex.throwdemo;

public class ExChain {

	public static void main(String[] args)throws Exception {
		System.out.println("in main");
//		try {
			A.print();
			System.out.println("main done");
//		} catch (Exception e) {
//			System.out.println("Take care");
//		}
		System.out.println("work done");
		
 }
}
class A{
	static void print() throws Exception{
		System.out.println("in A");
		B.check();
		System.out.println("error....");
		System.out.println("A done");
	}
}
class B{
	static void check() throws Exception {
		System.out.println("in B");
		C.show();
		System.out.println("B done");
	}
}
class C{
	static void show() throws Exception{
		System.out.println("in C");
		int x=20;
		if(x>10)
			throw new Exception();
		System.out.println("C done");
	}
}
