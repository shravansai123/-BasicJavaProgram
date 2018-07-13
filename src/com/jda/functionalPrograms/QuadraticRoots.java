package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class QuadraticRoots {
public static void main(String args[]){
	Utility util=new Utility();
	System.out.println("Enter the value of a ");
	int a=util.getNoOfFlips();
	System.out.println("Enter the value of b ");
	int b=util.getNoOfFlips();
	System.out.println("Enter the value of c ");
	int c=util.getNoOfFlips();
	util.getQuadraticRoots(a,b,c);
}
}