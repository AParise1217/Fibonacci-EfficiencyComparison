/*
 * Andrew Parise
 * 4/11/16
 * Assignment 8.1
 * FibRecursiveTest.java
 * 
 * Class Overview:
 * Tests the functionality of the FibRecursive.java class
 * 
 * 
 */
public class FibRecursiveTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibRecursive fib1 = new FibRecursive(5);
		fib1.printFibNums();
		System.out.println(fib1.getTotalCalls());
	}

}
