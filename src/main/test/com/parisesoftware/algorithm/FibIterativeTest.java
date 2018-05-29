package com.parisesoftware.algorithm;

import com.parisesoftware.algorithm.FibIterative;
import com.parisesoftware.output.IRuntimeDataExporter;
import com.parisesoftware.output.RuntimeDataExporterNull;

/*
 * @author	Andrew Parise
 * @since 	4/11/16
 * @version 5/28/18
 * @description Performs tests on the efficiency of the different fibonacci algortithms up until a particular value
 */
public class FibIterativeTest {

	public static void main(String[] args) {
		IRuntimeDataExporter dataExporter = new RuntimeDataExporterNull();
		FibIterative fib1 = new FibIterative(dataExporter, 5);
		fib1.export();
		System.out.println(fib1.getTotalCalls());
	}

}
