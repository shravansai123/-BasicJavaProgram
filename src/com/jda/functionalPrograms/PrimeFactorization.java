package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class PrimeFactorization {
	public static void main(String args[]){
		System.out.println("Enter the value of N");
		Utility util=new Utility();
		int value=util.getNoOfFlips();
		System.out.println("Prime Factors of "+value+"are");
		util.printFactors(value);
	}
}
