package com.jda.algorithmPrograms;

import com.jda.utility.Utility;

public class TemperatureConversion {
	public static void main(String[] args){
		Utility util=new Utility();
		System.out.println("Enter the conversion");
		System.out.println("1 celsius to fahrenheit");
		System.out.println("2 Fahrenheit to celsius");
		int x=util.getNoOfFlips();
		System.out.println("Enter temperature");
		double f=Double.parseDouble(util.getInputName());
		double result=Utility.tempConversion(f,x);
		System.out.println(result);
	}
}
