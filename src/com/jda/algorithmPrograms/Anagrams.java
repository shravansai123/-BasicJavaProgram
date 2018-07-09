package com.jda.algorithmPrograms;

import com.jda.utility.Utility;

public class Anagrams {
public static void main(String args[]){
	System.out.println("Enter the strings");
	Utility util = new Utility();
	String str1=util.getInputName();
	String str2=util.getInputName();
	boolean result=util.checkAnagrams(str1,str2);
	if(result)
		System.out.println("these are anagrams");
		else
		System.out.println("these are not anagrams");	
}
}
