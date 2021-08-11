package com.anurag;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StringCalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAddInitial() {

        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.add("");
        int excepted=0;
        assertEquals("Checking result of empty string",excepted,actual);
        
    }
    @Test
    public void testAddOneNumber(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.add("1");
        int excepted=1;
        assertEquals("Adding one number",excepted,actual);
    }
    @Test
    public void testAddTwoNumber(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.add("1,2");
        int excepted=3;
        assertEquals("Adding Two number",excepted,actual);
    }
    @Test
    public void testAddAnyNumbers(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.add("1,2,3,4");
        int excepted=10;
        assertEquals("Adding Any number",excepted,actual);
    }
    @Test
    public void testAddNewLine(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.add("1\n2,3,4");
        int excepted=10;
        assertEquals("Adding Two number including new line",excepted,actual);
    }
    @Test
    public void testAddDelimiterFeature(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.add("//;\n1;2;3");
        int excepted=6;
        assertEquals("Adding Two number with changed delimiter",excepted,actual);
    }
    @Test(expected = RuntimeException.class)
    public void testAddNegativeNumbers(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.add("//;\n1;2;3;-1;-2;-3;6");
    }
    @Test
    public void testCountAddInvoke(){
        StringCalculator stringCalculator=new StringCalculator();
        stringCalculator.add("//;\n1;2;3");
        stringCalculator.add("//;\n1;2;3");
        stringCalculator.add("//;\n1;2;3");
        int excepted=3;
        assertEquals("Get count of number of time Add is Invocated",excepted,stringCalculator.getCalledCount());
    }
    @Test
    public void testAddIgnoreBigNumber(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.add("//;\n1;2;1000");
        int excepted=3;
        assertEquals("Adding number ignoring number more than 1000",excepted,actual);
    }


}
