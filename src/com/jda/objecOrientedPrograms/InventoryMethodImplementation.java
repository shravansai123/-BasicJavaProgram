package com.jda.objecOrientedPrograms;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.Utility;

public class InventoryMethodImplementation implements InventoryMethods {

	@Override
	public HashMap<String, LinkedList<Inventory>> read() {
		JSONParser parser = new JSONParser();
		HashMap<String, LinkedList<Inventory>> inventoryMap = new HashMap<String, LinkedList<Inventory>>();
		try {
			Object obj = parser.parse(new FileReader("/home/bridgelabz/workspace/basicjavaPrograms/-BasicJavaProgram/final2.json"));
			JSONObject jsonObject = (JSONObject) obj;
			String[] inventoryName = { "Rice", "Pulses", "Wheat" };
			for (String i : inventoryName) {
				JSONArray object = new JSONArray();
				object = (JSONArray) jsonObject.get(i);
				LinkedList<Inventory> list = new LinkedList<Inventory>();
				for (Object inventory : object) {
					Inventory inven = new Inventory();
					inven.setName((String) ((JSONObject) inventory).get("Name"));
					inven.setWeight(Double.parseDouble((String) ((JSONObject) inventory).get("Weight")));
					inven.setPrice(Double.parseDouble((String) ((JSONObject) inventory).get("Price Per Kg")));
					list.add(inven);				
				}
				inventoryMap.put(i, list);
			}

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inventoryMap;
	}

	@Override
	public void add() {
		HashMap<String, LinkedList<Inventory>> inventoryMap = read();
		Utility util = new Utility();
		Inventory add = new Inventory();
		System.out.println("Which product do you want to add?");
		String product = util.getInputName();
		System.out.println("name of the " + product);
		String name = util.getInputName();
		add.setName(name);
		System.out.println("Weight of the " + product);
		double weight = util.getValue();
		add.setWeight(weight);
		System.out.println("Price per Kg ");
		double price = util.getValue();
		add.setPrice(price);

		inventoryMap.get(product).add(add);
		toFile(inventoryMap);
	}

	@Override
	public void delete() {
		HashMap<String, LinkedList<Inventory>> inventoryMap = read();
		System.out.println("Enter the name ");
		Utility util = new Utility();
		String name = util.getInputName();
		Iterator iterator = inventoryMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key=iterator.next().toString();
			LinkedList<Inventory> list = inventoryMap.get(key);
			for (Inventory k : list) {
				if (k.getName().toString().compareTo(name) ==0){
					list.remove(k);
					toFile(inventoryMap);
					System.out.println(name);
					break;
				}
			}
		}
	}

	public void toFile(HashMap<String, LinkedList<Inventory>> map) {
		JSONObject obj = new JSONObject();
		int k = 0;
		Iterator iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next().toString();
			LinkedList<Inventory> i = map.get(key);
			JSONArray jarray = new JSONArray();
			int j = 0;
			while (j < i.size()) {
				Inventory inven = new Inventory();
				inven.setName(i.get(j).getName());
				inven.setWeight(i.get(j).getWeight());
				inven.setPrice(i.get(j).getPrice());
				jarray.add(inven);
				j++;
			}
			obj.put(key, jarray);
			k++;
		}

		try (FileWriter file = new FileWriter("final2.json")) {

			obj.writeJSONString(file);
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void valueOfInventory() {
		HashMap<String, LinkedList<Inventory>> inventoryMap = read();
		double totalInventory=0;
		Iterator iterator = inventoryMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key=iterator.next().toString();
			LinkedList<Inventory> list = inventoryMap.get(key);
			for (Inventory k : list) {
				double value=k.getPrice()*k.getWeight();
				System.out.println(k.getName()+"  "+value);
				totalInventory+=value;
			}}

		System.out.println("Total Inventory "+totalInventory);
	}
}
