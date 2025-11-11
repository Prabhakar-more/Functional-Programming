package com.pm.practice_task;

import java.util.function.Function;

public class FunctionTask1 {

	public static void main(String[] args) {
       // Create a Function that checks a string length
		Function<String, Integer> wordsLength = words -> words.length();
		
		String[] names = {"AI", "ChatGPT", "FunctionalInterface"};

         for (String name : names) 
			 {
			 
              System.out.println(name + " -> " + wordsLength.apply(name));
             
			 }

	}

}

/*
 * Problem:
Write a Java program that uses a Function<String, Integer> lambda to find the length of a given string.

Your program should:

Create a Function<String, Integer> that takes a string and returns its length.

Apply it to a few sample strings like "AI", "ChatGPT", and "FunctionalInterface".

Print both the original string and its length.

Example expected output:
AI -> 2  
ChatGPT -> 7  
FunctionalInterface -> 19

 * */
