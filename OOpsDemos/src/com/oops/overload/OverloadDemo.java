package com.oops.overload;

public class OverloadDemo {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.area(10);
		shape.area(10.5f);
		int rect = (int)shape.area(10,20);
		System.out.println("Rectangle "+rect);
		System.out.println("Tri "+ shape.area(10,(int)20.5f));
	}

}
