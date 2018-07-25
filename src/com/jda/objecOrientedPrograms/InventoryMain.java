package com.jda.objecOrientedPrograms;

import com.jda.utility.Utility;

public class InventoryMain {
public static void main(String[] args){
	
	Utility util=new Utility();
	InventoryMethodImplementation invent = new InventoryMethodImplementation();
	int choice=0;
	do{
		System.out.println("Enter the choice 1. add 2. delete 3. print Value of Inventory");
		 choice=util.getNoOfFlips();
		switch(choice){
		case 1:	invent.add();break;
		case 2:invent.delete();break;
		case 3:invent.valueOfInventory();break;
		}
	}while(choice!=0);
}
}
