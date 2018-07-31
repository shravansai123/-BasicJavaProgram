package com.jda.objecOrientedPrograms;

public class Stock {
	String name;
	double noOfShares;
	double price;

	public String getName() {
		return this.name;
	}

	public double getnoOfShares() {
		return this.noOfShares;
	}

	public double getPrice() {
		return this.price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setnoOfShares(double noOfShares) {
		this.noOfShares = noOfShares;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString(){
		String x="\n{\n"+"\"Name\" : \""+name+"\"\n" +"\"Share Price\" : \""+price+"\"\n"+"\"Number of Shares\" : \""+noOfShares+"\"\n"+"}\n";
		return x;
	}
}
