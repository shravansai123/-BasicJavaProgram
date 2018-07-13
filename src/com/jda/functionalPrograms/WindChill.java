package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class WindChill {
public static void main(String args[]){
	Utility util=new Utility();
   double result=util.getWinchill(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
   System.out.println("The effective Temperature is (F)"+ result);
}
}
