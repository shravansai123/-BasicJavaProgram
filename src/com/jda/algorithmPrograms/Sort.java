package com.jda.algorithmPrograms;


import com.jda.utility.Utility;

public class Sort {
public static  void main (String args[]){
	Integer intArray[]={3,5,4,2,1};
	String strArray[]={"as","bsdd","dsd","cs"};
	double insertionSortIntArrayStartTime=System.currentTimeMillis();
	Integer insertionSortIntArray[]=Utility.insertionSort(intArray);
	System.out.println("Printing integer array after insertion sort ");
	Utility.printarray(insertionSortIntArray);
	double insertionSortIntArrayElapsedTime=System.currentTimeMillis()-insertionSortIntArrayStartTime;
	System.out.println("insertion sort elapsed time integer "+insertionSortIntArrayElapsedTime);
	
	double insertionSortStrArrayStartTime=System.currentTimeMillis();
	String insertionSortStrArray[]=Utility.insertionSort(strArray);
	System.out.println("Printing String array after insertion sort ");
	Utility.printarray(insertionSortStrArray);
	double insertionSortStrArrayElapsedTime=System.currentTimeMillis()-insertionSortStrArrayStartTime;
	System.out.println("insertion sort elapsed time String "+insertionSortStrArrayElapsedTime);
	
	double bubbleSortIntArrayStartTime=System.currentTimeMillis();
	Integer bubbleSortIntArray[]=Utility.bubbleSort(intArray);
	System.out.println("Printing integer array after bubble sort ");
	Utility.printarray(bubbleSortIntArray);
	double bubbleSortIntArrayElapsedTime=System.currentTimeMillis()-bubbleSortIntArrayStartTime;
	System.out.println("bubble sort elapsed time integer "+bubbleSortIntArrayElapsedTime);
	
	double bubbleSortStrArrayStartTime=System.currentTimeMillis();
	String bubbleSortStrArray[]=Utility.bubbleSort(strArray);
	System.out.println("Printing String array after bubble sort ");
	Utility.printarray(bubbleSortStrArray);
	double bubbleSortStrArrayElapsedTime=System.currentTimeMillis()-bubbleSortStrArrayStartTime;
	System.out.println("bubble sort elapsed time String "+bubbleSortStrArrayElapsedTime);
	
	double binarySearchInt=System.currentTimeMillis();
	int index=Utility.binarySearch(insertionSortIntArray, 0, intArray.length-1, 4);
	if(index==-1)
		System.out.println("Element is not present");
	else
	System.out.println("binary search index for integers is "+index);
	double binarySearchIntElapsedTime=System.currentTimeMillis()-binarySearchInt;
	System.out.println("binary search  elapsed time integer "+(binarySearchIntElapsedTime+insertionSortIntArrayElapsedTime));
	
	int inde1=Utility.binarySearch(bubbleSortStrArray, 0, bubbleSortStrArray.length-1, "cs");
	System.out.println("Element is  present" +inde1);
}
}
