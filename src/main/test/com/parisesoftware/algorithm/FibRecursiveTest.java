package com.parisesoftware.algorithm;

import com.parisesoftware.output.IRuntimeDataExporter;
import com.parisesoftware.output.RuntimeDataExporterNull;

/*
 * @author	Andrew Parise
 * @since 	4/11/16
 * @version 5/28/18
 * @description Performs tests on the efficiency of the different fibonacci algortithms up until a particular value
 */
public class FibRecursiveTest {

	public static void main(String[] args) {
		IRuntimeDataExporter dataExporter = new RuntimeDataExporterNull();
		FibRecursive fib1 = new FibRecursive(dataExporter, 5);
		fib1.printFibNums();
		System.out.println(fib1.getTotalCalls());
	}

}
