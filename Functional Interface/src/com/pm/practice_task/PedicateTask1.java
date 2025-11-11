package com.pm.practice_task;

import java.util.function.Predicate;

public class PedicateTask1 {
    public static void main(String[] args) {
        // Create a Predicate that checks if a string has more than 5 characters
        Predicate<String> isLongerThan5 = str -> str.length() > 5;

        // Test with sample strings
        String[] words = {"Hello", "OpenAI", "LambdaFunctions"};

        for (String word : words) {
            System.out.println(word + " -> " + isLongerThan5.test(word));
        }
    }
}


/*
 * Problem:
Write a Java program that uses a Predicate<String> lambda to check if a given string has more than 5 characters.
Your program should:

Create a Predicate<String> that returns true if the string’s length is greater than 5.

Test it with a few sample strings like "Hello", "OpenAI", and "LambdaFunctions".

Print out whether each string passes the test.

Example expected output:
Hello -> false  
OpenAI -> true  
LambdaFunctions -> true

 * */
