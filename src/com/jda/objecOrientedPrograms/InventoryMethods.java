package com.jda.objecOrientedPrograms;

import java.util.HashMap;
import java.util.LinkedList;

public interface InventoryMethods {

	public void add();

	public HashMap<String, LinkedList<Inventory>> read();

	public void delete();
	
	public void valueOfInventory();

}
