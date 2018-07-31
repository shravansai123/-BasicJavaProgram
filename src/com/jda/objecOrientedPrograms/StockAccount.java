package com.jda.objecOrientedPrograms;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.jda.utility.Utility;

public class StockAccount {

	public void buy(LinkedList<Stock> stock, LinkedList<Customer> customer, LinkedList<Transaction> transaction)
	      throws IOException {
		System.out.println("Enter customer name  ");
		int i = 0, j = 0;
		Customer person = new Customer();
		Utility util = new Utility();
		String name = util.getInputStringline();
		while (i < customer.size()) {
			if (name.compareTo(customer.get(i).getName()) == 0) {
				person = customer.get(i);
				break;
			} else {
				i++;
			}
		}
		System.out.println("Enter the stock you want to buy  ");
		Stock company = new Stock();
		String stockName = util.getInputStringline();
		while (j < stock.size()) {
			if (stockName.compareTo(stock.get(j).getName()) == 0) {
				company = stock.get(j);
				break;
			} else {
				j++;
			}
		}
		System.out.println("Number Of stocks you want to buy  ");
		double numberOfShares = Double.parseDouble(util.getInputStringline());
		double amount = 0;
		Transaction trans = new Transaction();
		if (person.getPrice() >= (numberOfShares * company.getPrice()) && (company.getnoOfShares() > numberOfShares)) {
			amount = person.getPrice() - (numberOfShares * company.getPrice());
			customer.get(i).setPrice(amount);
			double shares = (company.getnoOfShares() - numberOfShares);
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			stock.get(j).setnoOfShares(shares);
			trans.setCustomerName(customer.get(i).getName());
			trans.setDate(timeStamp);
			trans.setNoOfStocks(numberOfShares);
			trans.setAmount((numberOfShares * company.getPrice()));
			trans.setStockName(stockName);
			transaction.add(trans);
		} else {
			System.out.println("not possible  ");
		}
		toFile(transaction, customer, stock);
	}

	public void toFile(LinkedList<Transaction> transaction, LinkedList<Customer> customer, LinkedList<Stock> stock)
	      throws IOException {
		JSONObject obj = new JSONObject();
		JSONArray jarray = new JSONArray();
		for (Transaction trans : transaction)

			jarray.add(trans);
		obj.put("Transaction", jarray);
		try (FileWriter file = new FileWriter("transaction.json")) {

			obj.writeJSONString(file);
			file.flush();

		}
		JSONObject obj1 = new JSONObject();
		JSONArray jarray1 = new JSONArray();
		for (Customer trans : customer)
			jarray1.add(trans);
		obj1.put("Customer", jarray1);
		try (FileWriter file = new FileWriter("Customer.txt")) {

			obj1.writeJSONString(file);
			file.flush();
		}

		JSONObject obj2 = new JSONObject();
		JSONArray jarray2 = new JSONArray();
		for (Stock trans : stock)
			jarray2.add(trans);
		obj2.put("Stock", jarray2);
		try (FileWriter file = new FileWriter("Stock.txt")) {

			obj2.writeJSONString(file);
			file.flush();
		}
	}

	public void searchCustomer(LinkedList<Customer> customer) throws IOException {
		System.out.println("Enter the Customer name you want to get the details");
		Customer person = new Customer();
		Utility util = new Utility();
		String name = util.getInputStringline();
		int i = 0;
		while (i < customer.size()) {
			if (name.compareTo(customer.get(i).getName()) == 0) {
				person = customer.get(i);
				break;
			} else {
				i++;
			}
		}
		System.out.println(person);
	}

	public void searchCompanyStock(LinkedList<Stock> stock) throws IOException {
		System.out.println("Enter the Company name you want to get the details");
		Stock company = new Stock();
		Utility util = new Utility();
		String name = util.getInputStringline();
		int i = 0;
		while (i < stock.size()) {
			if (name.compareTo(stock.get(i).getName()) == 0) {
				company = stock.get(i);
				break;
			} else {
				i++;
			}
		}
		System.out.println(company);
	}
	public void printAll(LinkedList<Transaction> transaction, LinkedList<Customer> customer, LinkedList<Stock> stock){
		int i=0,j=0,k=0;
		System.out.println("Transaction ");
		while(i<transaction.size()){
			System.out.println(transaction.get(i));
			i++;
		}
		System.out.println("Customers ");
		while(j<customer.size()){
			System.out.println(customer.get(j));
			j++;
		}
		System.out.println("Stock ");
		while(k<stock.size()){
			System.out.println(stock.get(k));
			k++;
		}
	}
}
