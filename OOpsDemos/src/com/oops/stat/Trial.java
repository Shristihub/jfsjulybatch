package com.oops.stat;

public class Trial {
	static int x =10;
	static int y;
	static {
		x=2;y=3;
		System.out.println("In static block1");
	}
	static {
		System.out.println("In static block 2");
	}
	private Trial() {
		super();
		System.out.println("in constructor");
	}
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}

	static void checker() {
		System.out.println("checking numbers "+(x+y));
	}
	
//	public static void main(String[] args) {
//		checker();
//		Trial trial1 = new Trial();
//		Trial trial2 = new Trial();
//	}
}

