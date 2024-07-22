package com.shristi.basics;

public class ForDemo {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("while");
		int x=0;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		System.out.println("do-while");
		do {
			System.out.println(x);
			x--;
		}while(x>100);
//		
		
	}
}
