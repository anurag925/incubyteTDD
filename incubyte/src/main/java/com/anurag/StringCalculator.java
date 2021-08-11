package com.anurag;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class StringCalculator {
    public static int count = 0;

    public int getCalledCount() {
        return count;
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
        String delimeter = ",";
        if (number.substring(0, 2).equals("//")) {
            String split[] = number.substring(2).split("\n", 2);
            delimeter = split[0];
            number = split[1];
        }
        String[] numbers = number.split("[\n" + delimeter + "]");
        List<Integer> numberList = new ArrayList<Integer>();
        for (String string : numbers) {
            numberList.add(Integer.valueOf(string));
        }
        List<Integer> negativeIntegers = checkNegativeIntegers(numberList);
        if (negativeIntegers.size() > 0) {
            throw new RuntimeException("negatives not allowed " + negativeIntegers);
        }
        return numberList.stream().mapToInt(i -> i).sum();
    }
}
