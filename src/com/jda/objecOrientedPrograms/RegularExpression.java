package com.jda.objecOrientedPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.jda.utility.Utility;

public class RegularExpression {
public static void main(String[] args){
	Utility util= new Utility();
	System.out.println("Enter  name");
	String inputName=util.getInputName();
	String nameRegex="^[^\\d\\s]+$";
	String fullNameRegex="^[\\p{L} .'-]+$";
	Pattern pattern=Pattern.compile(fullNameRegex);
	Matcher matcher=pattern.matcher(inputName);
	while(!(matcher.find())){
		System.out.println("The name you entered is invalid. Enter valid name");
		inputName=util.getInputName();
		matcher=pattern.matcher(inputName);
	}
}
}
