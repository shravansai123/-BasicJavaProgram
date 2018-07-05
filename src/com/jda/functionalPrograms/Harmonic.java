package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class Harmonic {
	public static void main(String args[]){
		System.out.println("Enter the value of N");
		Utility util=new Utility();
		int value=util.getNoOfFlips();
		if( value!=0){
			double harmonicValue=util.printHarmonic(value);
			System.out.println(harmonicValue);
		}
	}

}
