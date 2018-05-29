package com.parisesoftware.output;

import java.util.LinkedList;

public class RuntimeDataExporterConsole implements IRuntimeDataExporter {


    public RuntimeDataExporterConsole(){}

    public void exportData(LinkedList<Integer> fibonacciNumbers) {
        for (int fibNumber : fibonacciNumbers) {
            System.out.println(fibNumber);
        }
    }
}
