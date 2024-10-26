package com.incubyte.dto;

public class StringCalculator {

    public static int add(String input){
        if(input.isEmpty()) {
            return 0;
        }

        String delimiter = ",|\n";
        String[] numbers = input.split(delimiter);
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
