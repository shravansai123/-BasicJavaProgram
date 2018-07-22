package com.jda.dataStructurePrograms;

import java.util.ArrayList;

import com.jda.utility.Stack;
import com.jda.utility.Utility;

public class StackAnagrams {
	public static void main(String[] args) throws Exception {
		Utility util = new Utility();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr = util.getPrime();
		Object[] ar = arr.toArray();
		int count = 0;
		int f = 0;
		Stack<Integer> anagramsStack = new Stack<Integer>(500);
		for (int j = 0; j < arr.size() - 1; j++) {
			for (int k = j + 1; k < arr.size(); k++) {
				boolean result = util.checkAnagrams(ar[j].toString(), ar[k].toString());
				if (result) {
					anagramsStack.push((Integer) ar[j]);
					anagramsStack.push((Integer) ar[k]);
					count = count + 2;
				}
			}
		}
		while (f < count) {
			System.out.println(anagramsStack.pop());
			f++;
		}
	}
}
