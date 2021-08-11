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
        String[] numbers=number.split(",");
        return Integer.valueOf(numbers[0])+Integer.valueOf(numbers[1]);
    }
}
