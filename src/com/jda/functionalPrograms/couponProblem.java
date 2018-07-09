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
	util.numberOfRandomNumbers(totalCoupons);
}
}
