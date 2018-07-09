package com.jda.functionalPrograms;

 

import com.jda.utility.Utility;
 

public class Triplets {
public static void main(String args[]) {
       System.out.println("Enter the value of N");
       Utility util=new Utility();
       int value=util.getNoOfFlips();
       System.out.println("Enter the integers");
       int inputNumbers[]=new int[value];
       inputNumbers=util.getArray(value);
       util.getTriplets(value, inputNumbers);

}

}