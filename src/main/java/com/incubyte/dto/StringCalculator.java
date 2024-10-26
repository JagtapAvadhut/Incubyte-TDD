package com.incubyte.dto;

public class StringCalculator {

    public static int add(String input){
        if(input.isEmpty()) {
            return 0;
        }

        String[] numbers = input.split(",");
        return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    }
}
