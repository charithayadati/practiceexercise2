package com.company.junit;

import java.util.Scanner;

public class StringReverse {
    public String reverseString(String input) {


        StringBuilder result = new StringBuilder();
        char inputArray[] = input.toCharArray();
        int j = 0;

        for (int i = (input.length() - 1); i >= 0; i--) {

            result= result.append(inputArray[i]);

            j++;
        }
        return result.toString();
    }

}
