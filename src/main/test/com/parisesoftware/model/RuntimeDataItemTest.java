package com.parisesoftware.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuntimeDataItemTest {

    private RuntimeDataItem runtimeDataItem;

    @Before
    public void setUp() {
        this.runtimeDataItem = new RuntimeDataItem();
    }

    @Test
    public void overloadedConstructorShouldPassParamsToAttributes(){

        //  given this data set...
        int testTestFibNum = 150;
        int testLoopCount = 100;
        int testDeclarationCount = 5000;
        int testConditionalCount = 2;

        //  when this method is invoked...
        this.runtimeDataItem = new RuntimeDataItem(testTestFibNum, testLoopCount, testConditionalCount, testDeclarationCount);

        //  I expect...
        assertEquals(runtimeDataItem.loopCount, testLoopCount);
        assertEquals(runtimeDataItem.conditionalCount, testConditionalCount);
        assertEquals(runtimeDataItem.targetFibNumber, testTestFibNum);
        assertEquals(runtimeDataItem.declarationCount, testDeclarationCount);

    }

    @Test
    public void setLoopCountShouldSetLoopCountAttribute(){
        //given
        int testLoopCount = 12345;

        //when
        this.runtimeDataItem.setLoopCount(testLoopCount);

        //verify
        assertEquals(runtimeDataItem.getLoopCount(), testLoopCount);
    }

    @Test
    public void setConditionalCountShouldSetConditionalCountAttribute(){
        //given
        int testConditionalCount = 54321;

        //when
        this.runtimeDataItem.setConditionalCount(testConditionalCount);

        //verify
        assertEquals(runtimeDataItem.getConditionalCount(), testConditionalCount);
    }

    @Test
    public void setDeclarationShouldSetDeclarationCountAttribute(){
        //given
        int testDeclarationCount = 1001001;

        //when
        this.runtimeDataItem.setDeclarationCount(testDeclarationCount);

        //verify
        assertEquals(runtimeDataItem.getDeclarationCount(), testDeclarationCount);
    }


}
