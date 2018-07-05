package com.jda.utility;

import java.util.ArrayList;
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
public boolean isLeapyear(int year){
	boolean check;
	if (year%400==0)
		check=true;
	else if(year%100==0)
		check=false;
	else if(year%4==0)
		check=true;
	else
		check=false;
	return check;
}
public String replaceStr(String template,String name){
	template=template.replaceAll("<<UserName>>",name);
	return template;
}
public void getTable(int power){
	ArrayList<Integer> leapYears=new ArrayList<Integer>();
 double value=Math.pow(2,power);
 int count=1;
	for(int i=2;i<=value;i+=2){
		System.out.println("2 * "+count+" = "+i);
      count++;	
      if(isLeapyear(i)){
      	leapYears.add(i);
      }
	}
	System.out.println("THe leap years are");
	for(int i=0;i<leapYears.size();i++){
		System.out.println(leapYears.get(i));
	}
}
public double printHarmonic(int value){
	double harmonic=0;
	for(double i=1;i<=value;i++){
		harmonic+=1/i;
	}
	return harmonic;
}
public void printFactors(int value){
	ArrayList<Integer> factors=new ArrayList<Integer>();
	for(int i=1;i*i<=value;i++){
		if(value%i==0){
			if(isPrime(i))
			factors.add(i);
			if(isPrime(value/i))
			factors.add(value/i);
		}
	}
	if(factors.size()>0){
	for(int i=0;i<factors.size();i++){
		System.out.println(factors.get(i));
	}}
	
}
	public boolean isPrime(int value){
	int	count=0;
	for(int i=1;i<=value;i++){
	if(value%i==0)
		count++;
	}
	if(count==2)
		return true;
	else
		return false;
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
