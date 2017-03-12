/*
 * Andrew Parise
 * 4/11/16
 * Assignment 8.1
 * FibRecursive.java
 * 
 * Class Overview:
 * Recursive implementation of the fibonacci algorithm
 * 
 */
import java.util.LinkedList;

public class FibRecursive {
	//init
	public LinkedList<Integer> fibNums;
	public int[] callTotals;

	public FibRecursive(int n){
		callTotals = new int[4];
		for(int i = 0; i < callTotals.length; i++){ //set all vals to zero
			callTotals[i] = 0;
		}
		fibNums = new LinkedList<Integer>();
		fib(n);
	}
	
	public void fib(int n){

		for(int i = 0; i < n; i++){
			addCall("LOOP");
			fibNums.add(i, fibonacci(i));
		}
		
	}
	public int fibonacci(int n){
		if(n < 2){
			addCall("CONDITIONAL");
			return n;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	public String getTotalCalls(){
		return "Total conditional statements: " + callTotals[3] + "\nTotal loops: " + callTotals[0];
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

	public void printFibNums(){
		//prints all of the fib numbers to the console
		for(int i = 0; i < fibNums.size(); i++){
			System.out.println(fibNums.get(i));
		}
		
	}
}
