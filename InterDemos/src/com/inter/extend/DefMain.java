package com.inter.extend;

public class DefMain {

	public static void main(String[] args) {
		NewCalculator newCalculator = new SimpleCalculator();
		newCalculator.add(12,12);
		newCalculator.product(1, 2);
		// call usig interface anme
		NewCalculator.processData();
	}
}
