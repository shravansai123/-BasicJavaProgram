package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class Gambler {
public static void main(String args[]){
	System.out.println("Enter Stake");
	Utility util=new Utility();
	int stake=util.getNoOfFlips();
	System.out.println("Enter Goal");
	int goal =util.getNoOfFlips();
	System.out.println("Enter Number of times");
int noOfRounds=util.getNoOfFlips();
util.gamble(stake, goal, noOfRounds);

}
}
