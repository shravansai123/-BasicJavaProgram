package com.jda.dataStructurePrograms;

import com.jda.utility.Deque;
import com.jda.utility.Utility;

public class DequeMain {
	public static void main(String args[]) {
		System.out.println("enter the value for checking palendrome");
		Utility util = new Utility();
		String value = util.getInputName();
		Deque<Character> data = new Deque<Character>();
		char[] val = value.toCharArray();
		for (int i = 0; i < val.length; i++) {
			data.insertAtRear(val[i]);
		}
		boolean check=false;
		for (int i = 0,j=val.length-1; i<j; i++,j--) {
			char front=data.removeAtFront();
			char rear=data.removeAtEnd();
			if(front==rear) {
				check=true;
			}
			else {
				check=false;
				break;
			}
		}
		System.out.println(check);
	}
}
