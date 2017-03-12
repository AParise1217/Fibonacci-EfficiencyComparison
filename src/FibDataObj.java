/*
 * Andrew Parise
 * 4/11/16
 * Assignment 8.1
 * FibDataObj.java
 * 
 * Class Overview:
 * Data object that stores the total conditional, declarative and loop statements as well as the iteration number
 * 
 */
public class FibDataObj {
	public int _fibNum, _numLoops, _numConds, _numDecs;
	public boolean _isRec;
	
	public FibDataObj(boolean isRec, int fibNum, int numLoops, int numConds, int numDecs){
		_fibNum = fibNum;
		_numLoops = numLoops;
		_numConds = numConds;
		_numDecs = numDecs;
	}
}
