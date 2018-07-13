package com.jda.algorithmPrograms;

import com.jda.utility.Utility;

public class MergeSort {
public  static void main(String args[]){
	String strArray[]={"abc","dsc","cdf","saf","avd"};
	
	Utility.mergeSort(strArray,0,4);
	Utility.printarray(strArray);
}
}
