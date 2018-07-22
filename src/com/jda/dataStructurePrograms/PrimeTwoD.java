package com.jda.dataStructurePrograms;

import com.jda.utility.Utility;

public class PrimeTwoD {
	public static void main(String[] args) {
		int numbers = 1;
		Utility util = new Utility();
		int[][] primeNumbers = new int[10][50];
		for (int i = 0; i < 10; i++) {
			int j = 0;
			while (numbers % 100 != 0 && numbers <= 1000) {
				if (util.isPrime(numbers)) {
					primeNumbers[i][j] = numbers;
					j++;
				}
				numbers++;
			}
			numbers++;
			while (j < 50) {
				primeNumbers[i][j] = 0;
				j++;
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 50; j++) {
				if (primeNumbers[i][j] != 0) {
					if (primeNumbers[i][j] <= 9)
						System.out.print("  " + primeNumbers[i][j] + "  ");
					else if (primeNumbers[i][j] <= 99)
						System.out.print(" " + primeNumbers[i][j] + "  ");
					else
						System.out.print(primeNumbers[i][j] + "  ");
				}
			}
			System.out.println();
		}

	}
}
