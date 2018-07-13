package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class TwoDArray {
public static void main(String args[]){
	System.out.println("Enter the datatype");
	Utility util=new Utility();
	String input=util.getInputName();
	System.out.println("Enter number of rows");
	int col=util.getNoOfFlips();
	System.out.println("Enter number of columns");
	int rows=util.getNoOfFlips();
	System.out.println("Enter the "+input+" values");	
	input=input.toLowerCase();
	switch(input){
	case "integer":util.twoDInteger(col,rows);
	case "double":util.twoDDouble(col,rows);
	case "boolean":util.twoDBoolean(col,rows);
	}
}
}
