/*
 * Andrew Parise
 * 4/11/16
 * Assignment 8.1
 * FibEfficiencyTest.java
 * 
 * Class Overview:
 * Performs tests on the efficiency of the different fibonacci algortithms up until a particular value
 * 
 */
import java.util.ArrayList;

public class FibEfficiencyTest {
	ArrayList<FibDataObj> recData;
	ArrayList<FibDataObj> iterData;
	
	public FibEfficiencyTest(int n){
		recData = new ArrayList<FibDataObj>(n);
		iterData = new ArrayList<FibDataObj>(n);
		
		popRecursive(n);
		popIter(n);
	}
	public void popRecursive(int n){
		//populates the recursive arraylist
		FibDataObj dataObj;
		for(int i = 0; i < n; i++){
			FibRecursive recFibCall = new FibRecursive(i);
			dataObj = new FibDataObj(true, i, recFibCall.callTotals[0], recFibCall.callTotals[3], recFibCall.callTotals[1]);
			recData.add(dataObj);
		}
		
	}
	
	public void popIter(int n){
		//populates the iterative arraylist
		FibDataObj dataObj;
		for(int i = 0; i < n; i++){
			FibIterative iterFibCall = new FibIterative(i);
			dataObj = new FibDataObj(false, i, iterFibCall.callTotals[0], iterFibCall.callTotals[3], iterFibCall.callTotals[1]);
			iterData.add(dataObj);
		}
		
	}
}
