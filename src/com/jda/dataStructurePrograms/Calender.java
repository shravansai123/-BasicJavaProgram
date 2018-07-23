package com.jda.dataStructurePrograms;

import com.jda.utility.Utility;

public class Calender {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		Utility util = new Utility();
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && util.isLeapyear(year))
			days[month ] = 29;
		System.out.println(months[month - 1] + " " + year);
		System.out.println();
		System.out.print("  S  M Tu  W Th  F  S");
		System.out.println();
		int[][] array = new int[6][7];
		int d = util.dayOfWeek(month, 1, year);
		int count = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < d)
					array[i][j] = 0;
				else {
					if (count <= days[month]) {
						array[i][j] = count;
						count++;
					} else
						array[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (array[i][j] <= 9) {
					if (array[i][j] == 0)
						System.out.print("   ");
					else
						System.out.print("  " + array[i][j]);
				} else
					System.out.print(" " + array[i][j]);
			}
			System.out.println();
		}

	}
}
