package com.parisesoftware.algorithm;

import com.parisesoftware.model.enums.RuntimeDataItemType;
import com.parisesoftware.output.IRuntimeDataExporter;

import java.util.LinkedList;

/*
 * @author	Andrew Parise
 * @since 	4/11/16
 * @version 5/28/18
 * @description	Iterative implementation of the fibonacci algorithm
 */
public class FibIterative implements IFibonacciAlgorithm {

    private IRuntimeDataExporter dataExporter;
    private LinkedList<Integer> fibNums;
	public int[] callTotals;
	private int howManyNumbers;

	public FibIterative(IRuntimeDataExporter dataExporter, int howManyNumbers){
        this.dataExporter = dataExporter;
        this.howManyNumbers = howManyNumbers;
	}

	public void performCalculation(){
		this.callTotals = new int[4];
		for(int i = 0; i < this.callTotals.length; i++){
			this.callTotals[i] = 0;
		}

		this.fibNums = new LinkedList<Integer>();
		addCall(RuntimeDataItemType.DECLARATION);
		calc(this.howManyNumbers);
	}

	public String getTotalCalls(){
		return "Total declarations: " + callTotals[1] + "\nTotal loops: " + callTotals[0];
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

	public void calc(int n){
		//Performs the operations to calc the fibonacci numbers
		int val1 = 0;
		addCall(RuntimeDataItemType.DECLARATION);

		int val2 = 1;
		addCall(RuntimeDataItemType.DECLARATION);

		fibNums.add(val1);
		addCall(RuntimeDataItemType.DECLARATION);

		fibNums.add(val2);
		addCall(RuntimeDataItemType.DECLARATION);

		for(int i = 2; i < n; i++){
			addCall(RuntimeDataItemType.LOOP);

			int saveVal1 = val1;
			addCall(RuntimeDataItemType.DECLARATION);

			val1 = val2;
			addCall(RuntimeDataItemType.DECLARATION);

			val2 = saveVal1 + val2;
			addCall(RuntimeDataItemType.DECLARATION);

            fibNums.add(val2);
            addCall(RuntimeDataItemType.DECLARATION);

		}

	}

    public void export() {
        this.dataExporter.exportData(this.fibNums);
    }

}
