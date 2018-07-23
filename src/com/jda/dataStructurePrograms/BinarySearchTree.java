package com.jda.dataStructurePrograms;

import com.jda.utility.Utility;

public class BinarySearchTree {
	public static long catalyn(int n) {
		if (n <= 1)
			return 1;
		long result = 0;
		for (int i = 0; i < n; i++)
			result += catalyn(i) * catalyn(n - i - 1);
		return result;
	}

	public static void main(String[] args) {
		System.out.println("enter the number of values you want to give");
		Utility util = new Utility();
		int n = util.getNoOfFlips();
		long[] data = new long[n];
		System.out.println("enter the values");
		for (int j = 0; j < n; j++) {
			int x = util.getNoOfFlips();
			data[j] = catalyn(x);
		}
		System.out.println("output values");
		for (int j = 0; j < n; j++) {
			System.out.println(data[j]);
		}

	}
}
