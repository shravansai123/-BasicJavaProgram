package com.jda.algorithmPrograms;

import com.jda.utility.Utility;

public class SwapNibbles {
	public static void main(String[] args){
	Utility util=new Utility();
	int n=util.getNoOfFlips();
	int[] result=Utility.swapnibbles(n);
	for(int i=0;i<result.length;i++){
		System.out.print(result[i]+" ");
		}
	}
}
