package com.pm.practice_task;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTask1 {

	public static void main(String[] args) {
		// Define Consumer
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());

        // Create a list of names
        List<String> names = List.of("java", "lambda", "interfaces");

        for (String name : names) {
        	printUpperCase.accept(name); 
        } 

	}

}

/*Task 3: Using a Lambda with Consumer

Problem:
Write a Java program that uses a Consumer<String> lambda to print each string in uppercase.

Your program should:

Create a Consumer<String> that prints the input string in uppercase.

Use it with a list or array like: "java", "lambda", "interfaces".

Output should show each string transformed to uppercase.

Example expected output:
JAVA
LAMBDA
INTERFACES

*/
