package com.jda.objecOrientedPrograms;

import java.util.Date;

public class Transaction {
String customerName;
String stockName;
double noOfStocks;
double amount;
String date;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getStockName() {
	return stockName;
}
public void setStockName(String stockName) {
	this.stockName = stockName;
}
public double getNoOfStocks() {
	return noOfStocks;
}
public void setNoOfStocks(double noOfStocks) {
	this.noOfStocks = noOfStocks;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString(){
	String x="\n{\n"+"\"Stock Name\" : \""+stockName+"\"\n" +"\"Customer Name\" : \""+customerName+"\"\n"+"\"Number of Stocks\" : \""+noOfStocks+"\"\n"+"\"Amount\" : \""+amount+"\"\n"+"\"date\" : \""+date+"\"\n"+"}\n";
	return x;
}
}
