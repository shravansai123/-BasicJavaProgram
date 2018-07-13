package com.jda.algorithmPrograms;

import com.jda.utility.Utility;

public class GuessTheNumber {
public static void main(String args[]){
	System.out.println("Enter the value of N ");
	Utility util=new Utility();
	int N=util.getNoOfFlips();
	util.guessNumber(0,N-1,(int)(Math. log(N)/Math.log(2)));
}
}
