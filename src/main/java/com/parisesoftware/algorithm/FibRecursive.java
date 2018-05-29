package com.parisesoftware.algorithm;

import com.parisesoftware.model.enums.RuntimeDataItemType;
import com.parisesoftware.output.IRuntimeDataExporter;

import java.util.LinkedList;

/*
 * @author	Andrew Parise
 * @since 	4/11/16
 * @version 5/28/18
 * @description	Recursive implementation of the fibonacci algorithm
 */
public class FibRecursive implements IFibonacciAlgorithm {

    private IRuntimeDataExporter dataExporter;
    private LinkedList<Integer> fibNums;
	public int[] callTotals;
    private int howManyNumbers;

	public FibRecursive(IRuntimeDataExporter dataExporter, int howManyNumbers){
	    this.dataExporter = dataExporter;
		this.howManyNumbers = howManyNumbers;
	}

	public void performCalculation(){
        this.callTotals = new int[4];
        for(int i = 0; i < callTotals.length; i++){ //set all vals to zero
            callTotals[i] = 0;
        }
        this.fibNums = new LinkedList<Integer>();
        fib(this.howManyNumbers);
    }

    public void export() {
        this.dataExporter.exportData(this.fibNums);
    }

    public void fib(int n){

		for(int i = 0; i < n; i++){
			addCall(RuntimeDataItemType.LOOP);
			fibNums.add(i, fibonacci(i));
		}
		
	}

	public int fibonacci(int n){
		if(n < 2){
			addCall(RuntimeDataItemType.CONDITIONAL);
			return n;
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public String getTotalCalls(){
		return "Total conditional statements: " + callTotals[3] + "\nTotal loops: " + callTotals[0];
	}

	public void addCall(RuntimeDataItemType callType){
		//increments type of call to later be used to determine efficiency

		if(callType == RuntimeDataItemType.LOOP){
			callTotals[0]++;
		}
		if(callType == RuntimeDataItemType.DECLARATION){
			callTotals[1]++;
		}
		if(callType == RuntimeDataItemType.INCREMENT){
			callTotals[2]++;
		}
		if(callType == RuntimeDataItemType.CONDITIONAL){
			callTotals[3]++;
		}
		
	}

	public void printFibNums(){
		//prints all of the fib numbers to the console
        for (Integer fibNum : fibNums) {
            System.out.println(fibNum);
        }
		
	}
}
