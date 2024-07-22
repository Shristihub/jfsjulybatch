package com.shristi.basics;

public class Greater {

	public static void main(String[] args) {
		int x=100;
		int y=20;
		int z=30;
		
		if(x>y && x>z) {
			System.out.println(x);
		}else if(y>z) {
			System.out.println(y);
		}else {
			System.out.println(z);
		}
		
		// find the greater of 3 numbers using ternary operator
		
		
		String result = x>y&&x>z?"x is greater":y>z?"y is greater":"z is greater";
		System.out.println(result);
		
		// x 100 y 20 z 30
		int d = z>(x>y?x:y)?z:((x>y)?x:y);
		System.out.println(d);
		
		//z>x?z:x
		
	}
}
