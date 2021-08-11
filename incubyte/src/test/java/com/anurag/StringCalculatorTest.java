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
        assertEquals("Adding Two number",excepted,actual);
    }

}
