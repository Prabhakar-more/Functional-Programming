package com.pm.practice_task;

import java.util.function.Predicate;

public class PrdiacateTask2 {

	public static void main(String[] args) {
		//Predicate to string starts with "A" or not
		Predicate<String> startsWithA = str -> str.startsWith("A");
		//predicate to check given string length is greater than 3 or not
		Predicate<String> lengthGreaterThan3 = str -> str.length()>3;
		
		String[] words = {"AI", "Alpha", "Code", "Ant"};
		
		Predicate<String> andPredicate = startsWithA.and(lengthGreaterThan3);
		Predicate<String> orPredicate = startsWithA.or(lengthGreaterThan3);
		Predicate<String> negatePredicate = startsWithA.negate();
		
		
		// Loop through and test each word
        for (String word : words) {
            System.out.println(
                word + " -> and: " + andPredicate.test(word)
                     + " | or: " + orPredicate.test(word)
                     + " | negate: " + negatePredicate.test(word)
            );
        }


	}

}


/*Task P2 (Predicate Intermediate)

Goal:
Use multiple predicates and combine them using and(), or(), and negate().

Instructions:

Create:
A Predicate<String> called startsWithA → returns true if a string starts with "A".
Another Predicate<String> called lengthGreaterThan3 → returns true if the string length > 3.

Combine them:
startsWithA.and(lengthGreaterThan3)
startsWithA.or(lengthGreaterThan3)
startsWithA.negate()

Test the combined predicates on strings like "AI", "Alpha", "Code", "Ant".

Print the results clearly so you can see how each combined predicate behaves.

Example Expected Output:
AI -> and: false | or: true | negate: false
Alpha -> and: true | or: true | negate: false
Code -> and: false | or: true | negate: true
Ant -> and: false | or: false | negate: false
*/