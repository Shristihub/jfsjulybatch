package com.oops.stat;

// import the static members
import static com.oops.stat.Trial.*;
import static java.lang.Integer.*;
import static java.lang.Math.pow;
import static java.lang.Class.forName;
import static java.lang.System.out;

public class Statdemo {
	static int a = 10;
	static int b;
	static {
		a = 5;b = 6;
		out.println("In static block -1 in statdemo");
	}
	static {
		out.println("In static block -2 in statdemo");
	}
	public static void main(String[] args) {
		try {
			forName("com.oops.stat.Trial");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		int v = parseInt("100");
		System.out.println(v);
		checker();
		System.out.println(pow(x, 2));
		System.out.println(pow(y, 2));

	}
}
