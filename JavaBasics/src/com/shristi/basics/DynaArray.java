package com.shristi.basics;

public class DynaArray {

	public static void main(String[] args) {
		int[][] nums = new int[3][];
		System.out.println(nums.length); // 0
//		System.out.println(nums[0][0]); //NullPointerException
		nums[0]= new int[3]; // memory allocated
		System.out.println(nums[0][0]); //returns 0
		
		nums[1]=new int[4];
		System.out.println(nums[1][0]); // returns 0
//        System.out.println(nums[2][0]); // NullPointerException
		nums[2] = new int[2];
		int x = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = x * 2;
				x++;
			}
			x++;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Using for each");
		int sum = 0;
		for (int[] one : nums)
			for (int val : one)
				sum += val;
		System.out.println(sum);

	}
}
