package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class Stopwatch {
public static void main(String args[]){
   Utility util=new Utility();
   double elapsedTime=util.getElapsedTime();
   System.out.println("Elapsed Time in milliseconds is "+ elapsedTime);
}
}
