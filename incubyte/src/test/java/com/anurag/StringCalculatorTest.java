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
        assertEquals("Test Case for checking result of empty string",excepted,actual);
        
    }
}
