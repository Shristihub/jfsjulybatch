package com.inter.basic;

@FunctionalInterface
public interface Greeter {

	void greetMessage(String username);
	default void show(String username) {
		
	}
	static void check() {
		
	}
}
