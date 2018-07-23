package com.jda.dataStructurePrograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.jda.utility.LinkedList;
import com.jda.utility.LinkedListNode;
import com.jda.utility.Utility;

public class UnorderedList {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		LinkedList<String> data = new LinkedList<String>();
		File f1 = new File("C:\\Users\\1022270\\Desktop\\filetest.txt");
		Scanner scanner = new Scanner(f1);
		while (scanner.hasNext()) {
			String nextword = scanner.next();
			data.add(new LinkedListNode<String>(nextword));
		}
		scanner.close();
		data.print();
		Utility util = new Utility();
		System.out.println("Enter the String to search");
		String search = util.getInputName();
		LinkedListNode<String> x = data.search(search);
		if (x != null) {
			data.removeAt(x.getValue());
		} else {
			data.add(new LinkedListNode<String>(search));
		}
		data.print();
		FileWriter fileWritter = new FileWriter(f1.getName(), true);
		BufferedWriter bw = new BufferedWriter(fileWritter);
		bw.write(search);
		bw.close();
	}
}