package com.anurag;

/**
 * Hello world!
 *
 */
public class StringCalculator 
{
    public int add(String number) {
        if(number.equals("")) return 0;
        if(number.length()==1) return Integer.valueOf(number);
        return 0;
    }
}
