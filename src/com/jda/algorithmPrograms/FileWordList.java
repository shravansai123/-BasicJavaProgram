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
	Scanner scanner =new Scanner(new File("C:\\Users\\1022270\\Desktop\\filetest.txt"));
	while (scanner.hasNext()){
		String nextword=scanner.next();
		data.add(nextword);		
	}
	String sort[]=data.toArray(new String[(data.size())]);
	String bubbleSortStrArray[]=Utility.bubbleSort(sort);
	int x=Utility.binarySearch(bubbleSortStrArray, 0, bubbleSortStrArray.length-1, "as") ;
	if(x==-1) {
		System.out.println("Not Found");
	}else {

		System.out.println("Found at "+x);
	}
}
}
