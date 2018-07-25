package com.jda.objecOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRicePulses {
public static void main(String[] args){
	JSONParser parser = new JSONParser();
	

		try {
			Object obj=parser.parse(new FileReader("/home/bridgelabz/Desktop/pulses.txt"));
			JSONObject jsonObject = (JSONObject) obj;
			
			JSONArray rice=(JSONArray) jsonObject.get("Rice");  

			System.out.println("productName"+" :  Rice");
		double riceValue= getDetailsofArray(rice);
		System.out.println("value of Rice= "+riceValue);
		JSONObject pulses=(JSONObject) jsonObject.get("Pulses");  
		System.out.println("productName"+" :  Pulses");
double pulsesValue=getDetails(pulses);
System.out.println("value of pulses= "+pulsesValue);
		JSONObject wheat=(JSONObject) jsonObject.get("Wheat");  
		System.out.println("productName"+" :  Wheat");
		double wheatValue=getDetails(wheat);
		System.out.println("value of wheat= "+wheatValue);
		
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

private static double getDetailsofArray(JSONArray productName) {
	int size=productName.size();
	int i=0;
	double riceValue=0;
	while(i<size){
		riceValue+= getDetails((JSONObject) productName.get(i));
		i++;
	}
	return riceValue;
}

private static double getDetails(JSONObject productName) {
	String name=(String) productName.get("Name");
	int weight=Integer.parseInt((String) productName.get("Weight"));
	double price=Double.parseDouble((String)productName.get("Price per kg"));
	System.out.println("Name"+" : "+name);
	System.out.println("Weight"+" : "+weight);
	System.out.println("Price per kg"+" : "+price);
	return price*weight;
} 
	}
