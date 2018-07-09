package com.jda.algorithmPrograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

public class Primenumbers {
public static void main(String args[]){
	Utility util = new Utility();
	ArrayList<Integer> arr= new ArrayList<Integer>();
	arr=util.getPrime();
System.out.println("prime numbers are");
util.printArrayList(arr);
Object[] ar=arr.toArray();
ArrayList<Integer> palen= new ArrayList<Integer>();
ArrayList<Integer> anagrams= new ArrayList<Integer>();
for(int i=0;i<arr.size();i++){
	if(util.palindrome(ar[i].toString())){
		palen.add((Integer) ar[i]);
	}
}
System.out.println("Palendrome numbers are");
util.printArrayList(palen);
System.out.println("Anagrams  are");
for(int j=0;j<arr.size()-1;j++){
	for(int k=j+1;k<arr.size();k++){
		boolean result=util.checkAnagrams(ar[j].toString(),ar[k].toString());
		if(result){
			anagrams.add((Integer) ar[j]);
		anagrams.add((Integer) ar[k]);
		System.out.println(ar[j]+"\t"+ar[k]);
		}			
	}
}
}
}
