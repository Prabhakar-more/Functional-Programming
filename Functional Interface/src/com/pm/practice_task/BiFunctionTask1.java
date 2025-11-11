package com.pm.practice_task;

import java.util.function.BiFunction;

public class BiFunctionTask1 {

    public static void main(String[] args) {
        // 1Define a BiFunction that adds two integers
        BiFunction<Integer, Integer, Integer> addNumbers = (a, b) -> a + b;

        // 2Test the BiFunction with a few pairs
        int result1 = addNumbers.apply(5, 10);
        int result2 = addNumbers.apply(3, 7);
        int result3 = addNumbers.apply(20, 25);

        
        System.out.println("5 + 10 = " + result1);
        System.out.println("3 + 7 = " + result2);
        System.out.println("20 + 25 = " + result3);
    }
}



/*Task 5: Using a Lambda with BiFunction

Problem:
Write a Java program that uses a BiFunction<Integer, Integer, Integer> lambda to add two integers and return the result.

Your program should:
Create a BiFunction<Integer, Integer, Integer> that adds two integers.
Use it to add different pairs (like 5,10, 3,7, 20,25).

Print the results clearly.

*Example expected output:
5 + 10 = 15  
3 + 7 = 10  
20 + 25 = 45

*/