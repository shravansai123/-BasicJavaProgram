package com.jda.functionalPrograms;

import com.jda.utility.Utility;

/**
 * @author shravan
 *
 */
public class couponProblem {
public static void main(String args[]){
	Utility util=new Utility();
	System.out.println("Enter total no of coupons'");
	int totalCoupons=util.getNoOfFlips();
	System.out.println("Enter the number of coupons to check");
	int totalCouponsToCheck=util.getNoOfFlips();
	System.out.println("Enter coupoun nos");

	int inputNumbers[]=new int[totalCouponsToCheck];
	inputNumbers=util.getArray(totalCouponsToCheck);
	util.numberOfRandomNumbers(inputNumbers, totalCoupons);
}
}
