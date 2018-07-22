package com.jda.dataStructurePrograms;

import java.util.Scanner;

import com.jda.utility.Queue;
import com.jda.utility.QueueNode;

public class QueueCashCounter {
	public static void main(String[] args) {
		System.out.println("Enter the initial bank balance");
		Scanner scanner = new Scanner(System.in);
		double bankBalance = scanner.nextDouble();
		System.out.println("Enter the number of persons in the queue");
		int queueSize = scanner.nextInt();
		Queue<Double> data = new Queue<Double>();
		for (int i = 0; i < queueSize; i++) {
			System.out.println("withdrawl or deposit for the user " + (i + 1));
			String purpose = scanner.next();
			if (purpose.compareTo("withdrawl") == 0) {
				System.out.println("Enter the amount to be withdrawn");
				double amount = scanner.nextDouble();
				data.enqueue(amount, purpose);

			} else {
				System.out.println("Enter the amount");
				double amount = scanner.nextDouble();
				data.enqueue(amount, purpose);
			}
		}
		for (int i = 0; i < queueSize; i++) {
			QueueNode<Double> temp = data.dequeue();
			if (temp.purpose.compareTo("deposit") == 0) {
				bankBalance += temp.value;
				System.out.println(i + 1 + " person money successfully deposited");
			} else {
				if (bankBalance - temp.value < 0)
					System.out.println(i + 1 + " no sufficient money in bank for withdrawl amount,please visit again");
				else {
					bankBalance -= temp.value;
					System.out.println(i + 1 + " person money successfully withdrawed");
				}
			}
		}
		System.out.println("Amount in bank " + bankBalance);
	}
}
