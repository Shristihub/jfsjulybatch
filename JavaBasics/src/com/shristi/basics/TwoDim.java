package com.shristi.basics;

public class TwoDim {

	public static void main(String[] args) {
		int[][] nums = new int[3][4];
		System.out.println(nums.length); // 0

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
