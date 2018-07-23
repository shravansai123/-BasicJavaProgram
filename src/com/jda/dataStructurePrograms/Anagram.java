package com.jda.dataStructurePrograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		Utility util = new Utility();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr = util.getPrime();
		Object[] ar = arr.toArray();
		int[][] anagrams = new int[100][2];
		int i = 0;
		for (int j = 0; j < arr.size() - 1; j++) {
			for (int k = j + 1; k < arr.size(); k++) {
				boolean result = util.checkAnagrams(ar[j].toString(), ar[k].toString());
				if (result) {
					anagrams[i][0] = (int) ar[j];
					anagrams[i][1] = (int) ar[k];
					i = i + 1;
				}
			}
		}
		for (int l = 0; l < +i; l++) {
			System.out.println(anagrams[l][0] + "  " + anagrams[l][1]);
		}
	}
}
