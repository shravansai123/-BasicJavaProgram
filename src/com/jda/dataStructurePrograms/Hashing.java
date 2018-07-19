package com.jda.dataStructurePrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import com.jda.utility.LinkedListNode;
import com.jda.utility.OrderedList;
import com.jda.utility.Utility;

public class Hashing {
	public static void main(String[] args) throws FileNotFoundException {
		boolean check=false;
		HashMap<Integer, OrderedList<Integer>> map = new HashMap<>();
		File f1 = new File("C:\\Users\\1022270\\Desktop\\filetest.txt");
		Scanner scanner = new Scanner(f1);
		while (scanner.hasNext()) {
			String nextword = scanner.next();
			int x = Integer.parseInt(nextword);
			add(map, x);
		}
		System.out.println("Enter the search integer");
		Utility util = new Utility();
		Integer value = util.getNoOfFlips();
		for (int i = 0; i < 11; i++) {
			if (map.containsKey(i)) {
				if (map.get(i).search(value) != null) {
					check=true;
					map.get(i).removeAt(value);
					if (map.get(i) == null)
						map.remove(i);
					break;
				} 
					
			}
		}
		if(!check) {
			add(map,value);
		}
		for (int i = 0; i < 11; i++) {
			if (map.containsKey(i)) {
				if (map.get(i) != null) {
					System.out.println("slot= " + i);
					map.get(i).print();
				}
			}
		}
	}

	public static void add(HashMap<Integer, OrderedList<Integer>> map, int x) {
		int y = x % 11;
		if (map.containsKey(y)) {
			map.get(y).add(new LinkedListNode(x));
		} else {
			OrderedList<Integer> vall = new OrderedList<Integer>();
			vall.add(new LinkedListNode(x));
			map.put(y, vall);
		}
	}
}
