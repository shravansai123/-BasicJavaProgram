package com.jda.algorithmPrograms;

import com.jda.utility.Utility;

public class Dayofweek {
	public static void main(String[] args){
		Utility util=new Utility();
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		int result=util.dayOfWeek(m, d, y);
		System.out.println(result);
	}
}
