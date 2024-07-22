package com.shristi.basics;

public class OneDim {

	public static void main(String[] args) {
		
		int[] nums = new int[4];
		System.out.println(nums.length);
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
//		nums[4]=60;
		int sum =0;
		for(int index=0;index<nums.length;index++) {
			sum+=nums[index];
		}
		System.out.println(sum);
		System.out.println("Using foreach");
		int sumsq=0;
		for(int val:nums) {
			sumsq+=(int)Math.pow(val, 2);
		}
		System.out.println(sumsq);
	}
	
}
