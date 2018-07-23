package com.jda.dataStructurePrograms;

import com.jda.utility.Stack;

public class StackMain {
	public static void main(String[] args) throws Exception {
		String inputData = "5+6)∗(7+8)/((4+3))(5+6)∗(7+8)/(4+3)";
		Stack<Character> value = new Stack<Character>(100);
		boolean check = true;
		char[] data = inputData.toCharArray();
		for (int i = 0; i < inputData.length(); i++) {
			if (data[i] == '(') {
				value.push(data[i]);
			} else if (data[i] == ')') {
				if (!(value.isEmpty())) {
					if (value.pop() == '(') {
						check = true;
					} else {
						check = false;
					}
				} else {
					check = false;
					break;
				}
			}
		}
		if (value.isEmpty()) {
			check = check && true;
		} else
			check = false;
		System.out.println(check);
	}
}
