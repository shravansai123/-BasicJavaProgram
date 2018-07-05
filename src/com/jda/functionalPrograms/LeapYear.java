package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class LeapYear {
public static void main(String args[]){
	System.out.println("Enter the Year ");
	Utility util=new Utility();
	int year=util.getNoOfFlips();
	if(year>999&&year<10000){
	boolean isLeapYear=util.isLeapyear(year);
	if(isLeapYear)
		System.out.println(year +" is Leap Year" );
	else
		System.out.println(year +" is not Leap Year" );
}
	else
		System.out.println("Print 4 digit");
}
}
