package com.streamd.meth;

public interface ICalculator {

	void calculate(int x, int y);
}

class CalculatorImpl implements ICalculator{

	@Override
	public void calculate(int x, int y) {
		System.out.println("Total "+(x+y));
	}
	
}