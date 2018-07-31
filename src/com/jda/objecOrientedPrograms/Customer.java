package com.jda.objecOrientedPrograms;

public class Customer {
	String name;
	long mobile ;
	double amount;

	public String getName() {
		return this.name;
	}

	public double getmobile() {
		return this.mobile;
	}

	public double getPrice() {
		return this.amount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setmobile(long mobile) {
		this.mobile = mobile;
	}

	public void setPrice(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString(){
		String x="\n{\n"+"\"Name\" : \""+name+"\"\n" +"\"Mobile\" : \""+mobile+"\"\n"+"\"Amount\" : \""+amount+"\"\n"+"}\n";
		return x;
	}
}