package com.inter.extend;

public interface NewCalculator {

	void add(int x, int y);

	// common to all implementation classes
	// can be overridden
	// can be called using the impl obj
	default void product(int x, int y) {
		System.out.println("in newcalc "+(x * y));
	}

	// common to all implementation classes
	// cannot be overridden
//	 can be called only using the interface name
	static void processData() {
		System.out.println("processing...");
	}
}
