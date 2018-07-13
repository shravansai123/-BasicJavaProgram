package com.jda.algorithmPrograms;

import com.jda.utility.Utility;

public class VendingMachine {
public static void main(String[] args){
	int notes[]={1,2,5,10,50,100,500,1000};
	Utility util=new Utility();
	System.out.println("Enter the change to return");
	int change=util.getNoOfFlips();
	int[] numberOfNotes=util.vending(notes,change);
	int count=0;
	for(int i=0;i<numberOfNotes.length;i++){
		if(numberOfNotes[i]>0){
			count+=numberOfNotes[i];
			System.out.println("the number of notes of Rs "+notes[i]+" used are "+numberOfNotes[i]);
		}
	}
	System.out.println("the total number of notes are "+count);
}
}
