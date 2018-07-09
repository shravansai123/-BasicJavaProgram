package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class Distance {
public static void main(String args[]){
   Utility util=new Utility();
   double distance=util.getDistance(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
	System.out.println("The distance is "+ distance);
}
}
