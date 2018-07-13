package com.jda.dataStructurePrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnorderedList {
	public static void main (String[] args) throws FileNotFoundException{
		LinkedList<String> data=new LinkedList<String>();
	Scanner scanner =new Scanner(new File("/home/bridgelabz/Desktop/filetest"));
	while (scanner.hasNext()){
		String nextword=scanner.next();
		data.add(new LinkedListNode<String>(nextword));		
}
	data.print();
}}