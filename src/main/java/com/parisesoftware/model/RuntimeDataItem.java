package com.parisesoftware.model;

/*
 * @author	Andrew Parise
 * @since 	4/11/16
 * @version 5/28/18
 * @description	POJO for containing related fib runtime data
 */
public class RuntimeDataItem {

    int targetFibNumber;
    int loopCount;
    int conditionalCount;
    int declarationCount;


    /**
     * Default Constructor
     */
    public RuntimeDataItem(){}

    /**
     * Constructor that handles the setting of class' variables
     *
     * @param targetFibNumber    the Fibonacci number this data point describes
     * @param loopCount  the quantity of loops executed in this execution
     * @param conditionalCount  the quantity of conditions executed in this execution
     * @param declarationCount   the quantity of declarations executed in this execution
     */
    public RuntimeDataItem(int targetFibNumber, int loopCount, int conditionalCount, int declarationCount){
        this.targetFibNumber = targetFibNumber;
        this.loopCount = loopCount;
        this.conditionalCount = conditionalCount;
        this.declarationCount = declarationCount;
    }

    /**
     * @return  the target fibonacci number
     */
    public int getTargetFibNumber() {
        return targetFibNumber;
    }

    /**
     * @param targetFibNumber the target fibonacci number to set
     */
    public void setTargetFibNumber(int targetFibNumber) {
        this.targetFibNumber = targetFibNumber;
    }

    /**
     * @return the number of loops executed in calculating the target fib number
     */
    public int getLoopCount() {
        return loopCount;
    }

    /**
     * @param loopCount the number of loops executed in this execution
     */
    public void setLoopCount(int loopCount) {
        this.loopCount = loopCount;
    }

    /**
     * @return the number of conditions executed in calculating the target fib number
     */
    public int getConditionalCount() {
        return conditionalCount;
    }

    /**
     * @param conditionalCount the number of conditionals executed
     *                         in calculating the target fib number
     */
    public void setConditionalCount(int conditionalCount) {
        this.conditionalCount = conditionalCount;
    }

    /**
     * @return the number of declarations executed in calculating the target fib number
     */
    public int getDeclarationCount() {
        return declarationCount;
    }

    /**
     * @param declarationCount the number of declarations made in calculating
     *                         the target fib number
     */
    public void setDeclarationCount(int declarationCount) {
        this.declarationCount = declarationCount;
    }
}
