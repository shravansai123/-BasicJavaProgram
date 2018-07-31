package com.jda.objecOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.Utility;

public class StockMain {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		LinkedList<Transaction> transaction = new LinkedList<Transaction>();

		JSONParser parser = new JSONParser();
		Object obj = parser
		      .parse(new FileReader("/home/bridgelabz/workspace/basicjavaPrograms/-BasicJavaProgram/Customer.txt"));
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray cust = (JSONArray) jsonObject.get("Customer");
		Object obj2 = parser
		      .parse(new FileReader("/home/bridgelabz/workspace/basicjavaPrograms/-BasicJavaProgram/Stock.txt"));
		JSONObject jsonObject2 = (JSONObject) obj2;
		JSONArray stk = (JSONArray) jsonObject2.get("Stock");
		Object obj3 = parser
		      .parse(new FileReader("/home/bridgelabz/workspace/basicjavaPrograms/-BasicJavaProgram/transaction.json"));
		JSONObject jsonObject3 = (JSONObject) obj3;
		JSONArray trs = (JSONArray) jsonObject3.get("Transaction");
		LinkedList<Customer> customer = new LinkedList<Customer>();
		LinkedList<Stock> stock = new LinkedList<Stock>();
		Customer person;
		for (Object pers : cust) {
			person = new Customer();
			person.setName((String) ((JSONObject) pers).get("Name"));
			person.setmobile(Long.parseLong((String) ((JSONObject) pers).get("Mobile")));
			person.setPrice(Double.parseDouble((String) ((JSONObject) pers).get("Amount")));
			customer.add(person);
		}
		readStock(stk, stock);
		readTransaction(trs, transaction);
		StockAccount account = new StockAccount();
		Utility util = new Utility();
		int choice = 0;
		do {
			System.out.println("Enter the choice 1. buy  2. search for a customer 3. Search for a Stock 4. Print");
			choice = util.getNoOfFlips();
			switch (choice) {
			case 1:
				account.buy(stock, customer, transaction);
				break;
			case 2:
				account.searchCustomer(customer);
				break;
			case 3:
				account.searchCompanyStock(stock);
				break;
			case 4:
				account.printAll(transaction,customer,stock);
				break;
			}
		} while (choice != 0);
	}

	private static void readTransaction(JSONArray trs, LinkedList<Transaction> transaction) {
		Transaction transaction1;
		int i = 0;
		while (i < trs.size()) {
			transaction1 = new Transaction();
			transaction1.setStockName((String) ((JSONObject) trs.get(i)).get("Stock Name"));
			transaction1.setCustomerName((String) ((JSONObject) trs.get(i)).get("Customer Name"));
			transaction1.setAmount(Double.parseDouble((String) ((JSONObject) trs.get(i)).get("Amount")));
			transaction1.setNoOfStocks(Double.parseDouble((String) ((JSONObject) trs.get(i)).get("Number of Stocks")));
			transaction1.setDate((String) ((JSONObject) trs.get(i)).get("date"));
			transaction.add(transaction1);
			i++;
		}
	}

	private static void readStock(JSONArray stk, LinkedList<Stock> stock) {
		Stock company;
		int i = 0;
		while (i < stk.size()) {
			company = new Stock();
			company.setName((String) ((JSONObject) stk.get(i)).get("Name"));
			company.setPrice(Double.parseDouble((String) ((JSONObject) stk.get(i)).get("Share Price")));
			company.setnoOfShares(Double.parseDouble((String) ((JSONObject) stk.get(i)).get("Number of Shares")));
			stock.add(company);
			i++;
		}
	}
}
