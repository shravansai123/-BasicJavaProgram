package com.jda.dataStructurePrograms;

import java.util.ArrayList;

import com.jda.utility.Queue;
import com.jda.utility.QueueNode;
import com.jda.utility.Utility;

public class QueueAnagrams {
	public static void main(String[] args) {
		Utility util = new Utility();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr = util.getPrime();
		Object[] ar = arr.toArray();
		Integer count = 0;
		int f = 0;
		Queue<Integer> queueAnagrams = new Queue<Integer>();
		for (int j = 0; j < arr.size() - 1; j++) {
			for (int k = j + 1; k < arr.size(); k++) {
				boolean result = util.checkAnagrams(ar[j].toString(), ar[k].toString());
				if (result) {
					queueAnagrams.enqueue((Integer) ar[j], count.toString());
					count++;
					queueAnagrams.enqueue((Integer) ar[k], count.toString());
					count++;
				}
			}
		}
		while (f < count) {
			QueueNode<Integer> temp = queueAnagrams.dequeue();
			System.out.println(temp.value);
			f++;
		}
	}

}
