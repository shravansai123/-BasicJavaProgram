package com.jda.functionalPrograms;

import com.jda.utility.Utility;

public class ReplaceString {
public static void main(String[] args){
	String templateSample="hello <<UserName>>, Howz Life?";
	System.out.println("Enter Username");
	Utility util = new Utility();
	String inputName=util.getInputName();
	String outputMessage=  util.replaceStr(templateSample, inputName);
	System.out.println(outputMessage);
	}
}
