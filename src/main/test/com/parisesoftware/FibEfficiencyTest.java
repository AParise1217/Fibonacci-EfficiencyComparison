package com.parisesoftware;

import com.parisesoftware.algorithm.FibIterative;
import com.parisesoftware.algorithm.FibRecursive;
import com.parisesoftware.model.RuntimeDataItem;
import com.parisesoftware.output.IRuntimeDataExporter;
import com.parisesoftware.output.RuntimeDataExporterNull;

import java.util.ArrayList;

/*
 * @author	Andrew Parise
 * @since 	4/11/16
 * @version 5/28/18
 * @description Performs tests on the efficiency of the different fibonacci algortithms up until a particular value
 */
public class FibEfficiencyTest {
	private ArrayList<RuntimeDataItem> recData;
	private ArrayList<RuntimeDataItem> iterData;
	
	public FibEfficiencyTest(int n){
		recData = new ArrayList<RuntimeDataItem>(n);
		iterData = new ArrayList<RuntimeDataItem>(n);
		
		popRecursive(n);
		popIter(n);
	}

	public void popRecursive(int n){
		//populates the recursive arraylist
		IRuntimeDataExporter dataExporter = new RuntimeDataExporterNull();

		RuntimeDataItem dataObj;
		for(int i = 0; i < n; i++){
			FibRecursive recFibCall = new FibRecursive(dataExporter, i);
			dataObj = new RuntimeDataItem(i, recFibCall.callTotals[0], recFibCall.callTotals[3], recFibCall.callTotals[1]);
			recData.add(dataObj);
		}
		
	}
	
	public void popIter(int n){
		//populates the iterative arraylist
		IRuntimeDataExporter dataExporter = new RuntimeDataExporterNull();

		RuntimeDataItem dataObj;
		for(int i = 0; i < n; i++){
			FibIterative iterFibCall = new FibIterative(dataExporter, i);
			dataObj = new RuntimeDataItem(i, iterFibCall.callTotals[0], iterFibCall.callTotals[3], iterFibCall.callTotals[1]);
			iterData.add(dataObj);
		}
		
	}
}
