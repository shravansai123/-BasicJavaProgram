package com.jda.objecOrientedPrograms;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.jda.utility.Utility;

public class RegularExpression {
	public static void main(String[] args) throws IOException {
		String message = "Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		Utility util = new Utility();

		System.out.println("Enter  name");
		String inputName = util.getInputName();
		String fullNameRegex = "^[\\p{L} .'-]+$";
		String mobileRegex="[0-9]+";
		String dateRegex="\\d{2}\\/\\d{2}\\/\\d{4}";
		while (true) {
			if (inputName.matches(fullNameRegex))
				break;
			else {
				System.out.println("The name you entered is invalid. Enter valid name");
				inputName = util.getInputName();
			}
		}
		message = message.replaceAll("<<name>>", inputName);
		System.out.println("Enter  full name");
		String inputFullName = util.getInputStringline();	
		while (true) {			
			if (inputFullName.matches(fullNameRegex))
				break;
			else {
				System.out.println("The name you entered is invalid. Enter valid name");
				inputFullName = util.getInputStringline();
			}
		}
		message = message.replaceAll("<<full name>>", inputFullName);
		System.out.println("Enter  mobile number");
		String mobile = util.getInputName();
		while (true) {
			if (mobile.matches(mobileRegex)&&mobile.length()==10)
				break;
			else {
				System.out.println("The number you entered is invalid. Enter valid number");
				mobile = util.getInputName();
			}
		}
		message = message.replaceAll("xxxxxxxxxx", mobile);
		System.out.println("Enter  date");

		String dateToday = util.getInputName();
		while (true) {
			if (dateToday.matches(dateRegex))
				break;
			else {
				System.out.println("The date you entered is invalid. Enter valid date");
				dateToday = util.getInputName();
			}
		}
		message = message.replaceAll("01/01/2016",dateToday);
		System.out.println(message);
	}
}
