package com.jda.algorithmPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.jda.utility.Utility;

public class FileWordList {
public static void main (String[] args) throws FileNotFoundException{
	ArrayList<String> data=new ArrayList<String>();
	Scanner scanner =new Scanner(new File("/home/bridgelabz/Desktop/filetest"));
	while (scanner.hasNext()){
		String nextword=scanner.next();
		data.add(nextword);		
	}
	String sort[]=data.toArray(new String[(data.size())]);
	String bubbleSortStrArray[]=Utility.bubbleSort(sort);

	System.out.println(bubbleSortStrArray[0]);
	System.out.println(bubbleSortStrArray[1]);
	Utility.binarySearch(bubbleSortStrArray, 0, bubbleSortStrArray.length-1, "this") ;
	
}
}
