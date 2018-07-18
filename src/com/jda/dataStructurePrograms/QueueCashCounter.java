package com.jda.dataStructurePrograms;

import java.util.Scanner;

import com.jda.utility.Queue;

public class QueueCashCounter {
	public static void main(String[] args) {
		System.out.println("Enter the initial bank balance");
		Scanner scanner = new Scanner(System.in);
		double bankBalance = scanner.nextDouble();
		System.out.println("Enter the number of persons in the queue");
		int queueSize = scanner.nextInt();
		Queue<Double> data = new Queue<Double>(queueSize);
		for (int i = 0; i < queueSize; i++) {
			System.out.println("withdrawl or deposit");
			String purpose = scanner.next();
			if (purpose.compareTo("withdrawl")==0) {
				System.out.println("Enter the amount to be withdrawn");
				double amount = scanner.nextDouble();
				data.enqueue(amount);
				if (bankBalance >= amount) {
					bankBalance=bankBalance-amount;
					System.out.println("Amount withdrawn");
					}
				else
					System.out.println("amount cannot be withdrawn");
			} else {
				System.out.println("Enter the amount");
				double amount = scanner.nextDouble();
				data.enqueue(amount);
				bankBalance=bankBalance+amount;
				System.out.println("Amount deposited");
			}
		}
		System.out.println("bank balance "+bankBalance);
	}
}
