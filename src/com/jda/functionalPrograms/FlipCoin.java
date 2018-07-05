package com.jda.functionalPrograms;

import com.jda.utility.Utility;


public class FlipCoin {
	public static void main(String[] args){
		System.out.println("Enter Number Of Flips");
		Utility util = new Utility();
		int number= util.getNoOfFlips();
		double percentofheads=util.getFlip(number);
		double percentofTails=100.00-percentofheads;
		System.out.println(percentofheads +" % Heads "+"vs "+percentofTails+" % Tails");
	}
}
