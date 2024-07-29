package com.oops.overload;

public class VarargsDemo {

	void calcSum(String name,int... nums) {
		System.out.println(name);
		System.out.println(nums.length);
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println(sum);
	}
	
	void calcSum(String name) {
		System.out.println("Great day "+name);
	}
	public static void main(String... args){
		VarargsDemo demo = new VarargsDemo();
		demo.calcSum("Priya",90,80);
		demo.calcSum("Jo");
		demo.calcSum("Kevin",90,80,70);
	}
}
