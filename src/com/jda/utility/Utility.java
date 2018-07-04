package com.jda.utility;

import java.util.Scanner;

public class Utility {
Scanner scanner;
public Utility(){
	scanner=new Scanner(System.in);
}
public String getInputName(){
	String name=scanner.next();
	return name;
	
}
public int getNoOfFlips(){
	int numberOfFlips=scanner.nextInt();
	return numberOfFlips;
}
public String replaceStr(String template,String name){
	template=template.replaceAll("<<UserName>>",name);
	return template;
}
public double getFlip(int flips){
	double countOfheads=0.0;
	for(int i=1;i<=flips;i++){
		double x= Math.random();
		if(x<0.5){
			countOfheads++;
		}
	}
	double percentofheads;
	percentofheads=countOfheads*100/flips;
	System.out.println(countOfheads);
	return percentofheads;
}
}
