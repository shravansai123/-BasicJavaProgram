package com.jda.objecOrientedPrograms;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockReport {
	public static void main(String[] args){
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(new FileReader("/home/bridgelabz/Desktop/Stock.txt"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray stock=(JSONArray) jsonObject.get("Stock"); 
			int i=0;
			double totalStockValue=0;
			while(i<stock.size()){
				totalStockValue+=getDetails((JSONObject)stock.get(i));
				i++;
			}
			System.out.println("Total value is "+totalStockValue);
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}

	private static double getDetails(JSONObject object) {
		String name=(String) object.get("Name");
		double sharePrice=Double.parseDouble((String)object.get("Share Price"));
		int noOfShares=Integer.parseInt((String)  object.get("Number of Shares"));
		System.out.println("Value of "+name+" is "+(sharePrice*noOfShares));
		return sharePrice*noOfShares;
	}
	
}