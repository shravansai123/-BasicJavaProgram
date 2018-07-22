package com.jda.dataStructurePrograms;

import java.util.HashMap;

import com.jda.utility.QueueToStacks;
import com.jda.utility.Utility;

public class TwoStacks {
	public static void main(String[] args) throws Exception {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		Utility util = new Utility();
		HashMap<Integer, QueueToStacks<Integer>> week = new HashMap<>();
		for (int i = 0; i < 6; i++) {
			QueueToStacks<Integer> queue = new QueueToStacks<Integer>(31);
			week.put(i, queue);
		}
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && util.isLeapyear(year))
			days[month] = 29;
		System.out.println(months[month - 1] + " " + year);
		System.out.println();
		System.out.print("  S  M Tu  W Th  F  S");
		System.out.println();
		int d = util.dayOfWeek(month, 1, year);
		int count = 1;
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < d)
					week.get(i).enqueue(0);
				else {
					if (count <= days[month]) {
						week.get(i).enqueue(count);
						count++;
					} else
						week.get(i).enqueue(0);
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				int temp = week.get(i).dequeue();
				if (temp <= 9) {
					if (temp == 0)
						System.out.print("   ");
					else
						System.out.print("  " + temp);
				} else
					System.out.print(" " + temp);
			}
			System.out.println();
		}
	}
}
