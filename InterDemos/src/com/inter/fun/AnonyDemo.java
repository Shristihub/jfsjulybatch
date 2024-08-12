package com.inter.fun;


class GreeterImpl implements IGreeter{

	@Override
	public void greetMessage(String name) {
		System.out.println("Great Day "+name);
	}
	
}
public class AnonyDemo {
	public static void main(String[] args) {
		// interface ref = implementation class
		// class implementing the interface
		IGreeter	ref = new GreeterImpl();
		ref.greetMessage("Sri");
		
		//anonymous inner class
		// implementation part
		IGreeter ref1 = new IGreeter() {

			@Override
			public void greetMessage(String name) {
				System.out.println("Hello "+name);
			}
			
		};
		System.out.println("Calling now");
		ref1.greetMessage("Priya");
	}
}







