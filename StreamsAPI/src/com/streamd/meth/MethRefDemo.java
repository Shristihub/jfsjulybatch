package com.streamd.meth;

class Processor{
	public void sum(int x, int y) {
		System.out.println("Sum "+(x+y));
	}
	public static void power(int x, int y) {
		System.out.println("Power "+Math.pow(x,y));
	}
}



public class MethRefDemo {

	public static void main(String[] args) {
//		ICalculator ref = new CalculatorImpl();
//		ref.calculate(1, 2);
//		
//		ref = new ICalculator() {
//			@Override
//			public void calculate(int x, int y) {
//				System.out.println("Product "+(x*y));
//			}
//		};
//		ref.calculate(10, 2);
//		
//		ref = (x,y)->System.out.println("Diff "+(x-y));
//		ref.calculate(10, 2);
		
		// method ref referring to a - non static 
		//obj::methodname
		Processor processor = new Processor();
		ICalculator calc = processor::sum; 
		calc.calculate(20, 30);
		
		// method ref referring to a - static 
		//classname::methodname
		
		ICalculator calc1 = Processor::power;
		calc1.calculate(20, 2);
		
		
		
		
	}
}











