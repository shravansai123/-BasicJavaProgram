package com.jda.utility;

import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**utility program
 * @author Shravan
 *
 */
public class Utility {
Scanner scanner;
/**
 * Constructor
 */
public Utility(){
	scanner=new Scanner(System.in);
}
/**this method is used to get the input 
 * @return
 */
public String getInputName(){
	String name=scanner.next();
	return name;
	
}
/**this method is used to get input number
 * @return the input number
 */
public int getNoOfFlips(){
	int numberOfFlips=scanner.nextInt();
	return numberOfFlips;
}
/**method to take input numbers from user
 * @param noOfRandomNumbers to give the number of input numbers to check
 * @return the array of coupon numbers
 */
public int[] getArray(int noOfRandomNumbers){
int arr[]=new int[noOfRandomNumbers];
	for(int i=0;i<noOfRandomNumbers;i++){
	arr[i]=(scanner.nextInt());
}
	return arr;
	}
/**this method is used to print number of random numbers required 
 * @param couponNumbers array of given coupon numbers
 * @param totalCoupons total number of coupons 
 */
public void numberOfRandomNumbers(int totalCoupons){
	Random x= new Random();
Set<Integer> arr=new HashSet<Integer>();
	int i=0;
	int count=0;
	while(i<totalCoupons){
		int check=x.nextInt(totalCoupons);
		count++;
		if(!(arr.contains(check))){
		arr.add(check);
		i++;
		}
		}
	
	System.out.println("The number of random numbers generated "+count);
	System.out.println(count);

}


/**this method is used ton print integer array values
 * @param row no of rows
 * @param col no of columns
 */
public void twoDInteger(int row,int col){
	PrintWriter output = new PrintWriter(System.out);
	int arr[][]=new int[row][col];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
		 arr[i][j]=scanner.nextInt();
		}
	}
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			output.print(arr[i][j]+"\t");
		}
		output.println();
	}
	output.flush();
	output.close();
	}



/**this is used to print double array values
 * @param row no of rows
 * @param col no of columns
 */
public void twoDDouble(int row,int col){
	PrintWriter output = new PrintWriter(System.out);
	double arr[][]=new double[row][col];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
		 arr[i][j]=scanner.nextDouble();
		}
	}
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			output.print(arr[i][j]+"\t");
		}
		output.println();
	}

	output.flush();
	output.close();
	}



/**this method is used to print 2d values of boolean
 * @param row no of rows
 * @param col no of columns
 */
public void twoDBoolean(int row,int col){
	PrintWriter output = new PrintWriter(System.out);
	boolean arr[][]=new boolean[row][col];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
		 arr[i][j]=scanner.nextBoolean();
		}
	}
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			output.print(arr[i][j]+"\t");
		}
		output.println();
	}

	output.flush();
	output.close();
	}
/**this method is used for knowing whether it is leap year
 * @param year = input year given by user for checking leap year
 * @return boolean value whether it is leap year or not
 */
public boolean isLeapyear(int year){
	boolean check;
	if (year%400==0)
		check=true;
	else if(year%100==0)
		check=false;
	else if(year%4==0)
		check=true;
	else
		check=false;
	return check;
}
/** this method is for replacing string
 * @param template is for initializing the template for printing
 * @param name given by the user input to replace in the template
 * @return modified template
 */
public String replaceStr(String template,String name){
	template=template.replaceAll("<<UserName>>",name);
	return template;
}
/** this method is for printing power table of 2 until give value of power
 * @param power value given by input user 
 */
public void getTable(int power){
	for(int i=0;i<=power;i++){
		System.out.println(Math.pow(2,i));
	}
}
/**this method is used for printing harmonic sum
 * @param value is the integer to which we have to find harmonic sum 
 * @return harmonic sum
 */
public double printHarmonic(int value){
	double harmonic=0;
	for(double i=1;i<=value;i++){
		harmonic+=1/i;
	}
	return harmonic;
}
/**this method is for printing prime factors
 * @param value is the number to which we have to find prime factors
 */
public void printFactors(int value){
	ArrayList<Integer> factors=new ArrayList<Integer>();
	for(int i=1;i*i<=value;i++){
		if(value%i==0){
			if(isPrime(i))
			factors.add(i);
			if(isPrime(value/i))
			factors.add(value/i);
		}
	}
	if(factors.size()>0){
	for(int i=0;i<factors.size();i++){
		System.out.println(factors.get(i));
	}}
	
}
	/**to check whether the number is prime
	 * @param value is the input number given by user
	 * @return boolean value whether it is prime or not
	 */
	public boolean isPrime(int value){
	int	count=0;
	for(int i=1;i<=value;i++){
	if(value%i==0)
		count++;
	}
	if(count==2)
		return true;
	else
		return false;
	}
	/** gambler win percent
	 * @param stake amount gambler has
	 * @param goal amount gambler has to win 
	 * @param noOfGames
	 */
	public void gamble(int stake, int goal, int noOfGames) {
		double gamesPlayed=0;
		double gamesWon=0;
		while(gamesPlayed<noOfGames){
			double stk=stake;
		while(!(stk>=goal||stk==0)){
			double check=Math.random();
			if(check>=0.5)
				stk++;
			else
				stk--;
		}
		if(stk==goal){
			gamesWon++;
		}
		gamesPlayed++;
	}
		
		System.out.println("No of games won"+gamesWon);
		System.out.println("No of games Lost"+(gamesPlayed-gamesWon));
		System.out.println("percent of wins"+(gamesWon*100/gamesPlayed));
	}
/** this method is for getting heads vs tails count
 * @param flips
 * @return percent of heads
 */
public double getFlip(int flips){
	double countOfheads=0.0;
	for(int i=1;i<=flips;i++){
		double x= Math.random();
		if(x<0.5){
			countOfheads++;
		}
	}
	double percentofheads;
	percentofheads=countOfheads*100/flips;
	System.out.println("Heads count "+countOfheads);
	return percentofheads;
}

	/**
	 * this is used to get the triplets whoose sum is 0
	 * 
	 * @param value
	 *           number of integers
	 * 
	 * @param arr
	 *           integers to be given to find out the triplets
	 * 
	 */
	public void getTriplets(int value, int arr[]) {
		int count = 0;
		for (int i = 0; i < value - 2; i++) {
			for (int j = i + 1; j < value - 1; j++) {
				for (int k = j + 1; k < value; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						count++;
						System.out.println(arr[i] + "\t" + arr[j] + "\t" + arr[k]);
					}
				}
			}
		}
		System.out.println("the number of triplets = " + count);
	}
	/**this is used to get the distance from origin
	 * @param x X coordinate 
	 * @param y Y coordinate
	 */
	public double getDistance(double x,double y){
		double z=Math.pow(Math.pow(x, 2)+Math.pow(y,2),0.5);
return z;
	}
	/**this is used to get elapsed time of the function 
	 * @return elapsed time
	 */
	public double getElapsedTime(){
		double startTime = System.currentTimeMillis();
		for(int i=1;i<10000000;i++){
		getDistance(2000000,500000000);
		}
		double elapsedTime=System.currentTimeMillis()-startTime;
		return elapsedTime;
	}
	/**this is used to get the quadratic roots
	 * @param a
	 * @param b
	 * @param c
	 */
	public void getQuadraticRoots(int a,int b, int c){
		double delta= (b*b) - (4*a*c);
		double x=(-b+ Math.sqrt(delta))/(2*a);
		double y=(-b- Math.sqrt(delta))/(2*a);
		System.out.println("the roots are "+x+" "+y);
	}
	/** this is the winchill equation
	 * @param t Temperature
	 * @param v Wind speed
	 * @return the effective temperature
	 */
	public double getWinchill(double t,double v){
		double w=35.74+(0.6215*t)+((0.4275*t)-35.75*(Math.pow(v, 0.16)));
		return w;
	}
	public boolean checkAnagrams(String str1,String str2){
		str1=str1.replaceAll("\\s","" );
		str2=str2.replaceAll("\\s","" );
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] str1array=str1.toCharArray();
		char[] str2array=str2.toCharArray();
		Arrays.sort(str1array);
		Arrays.sort(str2array);		
		if(Arrays.equals(str1array,str2array) ){
			return true;
		}
		else{
			return false;
		}
	}
	public ArrayList<Integer> getPrime(){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<1000;i++){
			if(isPrime(i)){
				arr.add(i);
			}
		}
		return arr;
	}
	public void printArrayList(ArrayList<Integer> arr){
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
	}
	public boolean palindrome(String str){
		boolean ch=true;
		char[] str1array=str.toCharArray();
		int j=str1array.length-1;
		for(int i=0;i<=j;i++,j--){
			if(!(str1array[i]==str1array[j])){
				ch=false;
				break;
			}
			ch=true;
		}
			return ch;
	}
	
}
