package com.anurag;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class StringCalculator {
    public int count = 0;

    public int getCalledCount() {
        return this.count;
    }

    private List<Integer> checkNegativeIntegers(List<Integer> numberList) {
        List<Integer> negativeNumbers = new ArrayList<>();
        for (Integer integer : numberList) {
            if (integer < 0)
                negativeNumbers.add(integer);
        }
        return negativeNumbers;
    }

    public int add(String number) {
        count++;
        if (number.equals(""))
            return 0;
        if (number.length() == 1)
            return Integer.valueOf(number);

        String delimeter = ",|\\n";
        if (number.substring(0, 2).equals("//")) {
            String split[] = number.substring(2).split("\n", 2);
            if (split[0].charAt(0) == '[') {
                String[] delStrings = split[0].split("]");
                String temp = "";
                for (String string : delStrings) {
                    for (char c : string.toCharArray()) {
                        if (c == '[')
                            continue;
                        else if ("\\.[]{}()*+?^$|".contains("" + c))
                            temp += "\\" + c;
                        else
                            temp += c;
                    }
                    temp += "|";
                }
                delimeter = temp + "\\n";
            }
            else{
                delimeter=split[0];
            }
            number = split[1];
        }
        String[] numbers = number.split(delimeter);
        List<Integer> numberList = new ArrayList<Integer>();
        for (String string : numbers) {
            int num = Integer.valueOf(string);
            if (num <= 1000)
                numberList.add(num);
        }
        List<Integer> negativeIntegers = checkNegativeIntegers(numberList);
        if (negativeIntegers.size() > 0) {
            throw new RuntimeException("negatives not allowed " + negativeIntegers);
        }
        return numberList.stream().mapToInt(i -> i).sum();
    }
}
