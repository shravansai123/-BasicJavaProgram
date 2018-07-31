package com.jda.objecOrientedPrograms;

public class Inventory {
	String name;
	double weight;
	double pricePerKg;

	public String getName() {
		return this.name;
	}

	public double getWeight() {
		return this.weight;
	}

	public double getPrice() {
		return this.pricePerKg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setPrice(double price) {
		this.pricePerKg = price;
	}
	@Override
	public String toString(){
		String x="\n{\n"+"\"Name\" : \""+name+" \"\n" +"\"Weight\" : \""+weight+"\"\n"+"\"Price Per Kg\" : \""+pricePerKg+"\"\n"+"}\n";
		return x;
	}
	
}
