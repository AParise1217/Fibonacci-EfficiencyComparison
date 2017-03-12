/*
 * Andrew Parise
 * 4/11/16
 * Assignment 8.1
 * FibIterative.java
 * 
 * Class Overview:
 * Iterative implementation of the fibonacci algorithm
 * 
 */

public class FibIterative {
	//init
	public int[] fibNums;
	public int[] callTotals;
	
	public FibIterative(int n){
		//Constructor:
			//Input: n = number of fib numbers to calc
			//Values stored in fibNums[]
		callTotals = new int[4];
		for(int i = 0; i < callTotals.length; i++){ //set all vals to zero
			callTotals[i] = 0;
		}
		
		fibNums = new int[n];
		addCall("DECLARATION");
		calc(n);
		
	}
	public String getTotalCalls(){
		return "Total declarations: " + callTotals[1] + "\nTotal loops: " + callTotals[0];
	}
	public void addCall(String callType){
		//increments type of call to later be used to determine efficiency
		callType.toUpperCase();

		if(callType == "LOOP"){
			callTotals[0]++;
		}
		if(callType == "DECLARATION"){
			callTotals[1]++;
		}
		if(callType == "INCREMENT"){
			callTotals[2]++;
		}
		if(callType == "CONDITIONAL"){
			callTotals[3]++;
		}
		
	}
	public void calc(int n){
		//Performs the operations to calc the fibonacci numbers
		int val1 = 0;
		addCall("DECLARATION");

		int val2 = 1;
		addCall("DECLARATION");

		fibNums[0] = val1;
		addCall("DECLARATION");

		fibNums[1] = val2;
		addCall("DECLARATION");

		for(int i = 2; i < n; i++){
			addCall("LOOP");

			int saveVal1 = val1;
			addCall("DECLARATION");

			val1 = val2;
			addCall("DECLARATION");

			val2 = saveVal1 + val2;
			addCall("DECLARATION");

			fibNums[i] = val2;
			addCall("DECLARATION");

		}
	}
	public void printFibNums(int[] fibNumbers){
		//Iterates through list of fibnumbers and prints them to console
		for(int i = 0; i < fibNumbers.length; i++){
			System.out.println(fibNumbers[i]);
		}
	}
	public void printFibNums(){
		//Iterates through list of fibnumbers and prints them to console
		int[] fibNumbers = fibNums;
		for(int i = 0; i < fibNumbers.length; i++){
			System.out.println(fibNumbers[i]);
		}
	}
	

}
