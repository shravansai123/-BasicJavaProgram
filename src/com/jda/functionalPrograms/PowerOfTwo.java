package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class PowerOfTwo {
public static void main(String args[]){
	System.out.println("Enter the value of N");
	Utility util=new Utility();
	int value=util.getNoOfFlips();
	if(value<31){
		util.getTable(value);		
	}
	else{
		System.out.println("the number is not valid. it should be less than 31");
	}
	
}
}
