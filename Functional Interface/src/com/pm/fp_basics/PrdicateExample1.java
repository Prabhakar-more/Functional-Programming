package com.pm.fp_basics;

import java.util.List;
import java.util.function.Predicate;

public class PrdicateExample1
{
	public static void main(String[] args) 
	{
		Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> greaterThan5 = n -> n > 5;
		
		List<Integer> numbers = List.of(10, 15, 20, 22);
		
		for (int number : numbers) {
        if (isEven.and(greaterThan5).test(number)) 
			{
               System.out.println(number + " is even AND greater than 5");
            }
        }

		
	}
}


/*
Predicate
Write a Predicate<Integer> that checks if a number is divisible by 5 and even.
Test it with 10, 15, 20, 22.
*/




/*
//Full Example

import java.util.List;
import java.util.function.Predicate;

class PredicateExample1 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> greaterThan5 = n -> n > 5;

        List<Integer> numbers = List.of(10, 15, 20, 22);

        System.out.println("Even numbers:");
        for (int number : numbers) {
            if (isEven.test(number)) {
                System.out.println(number);
            }
        }

        System.out.println("\nEven AND greater than 5:");
        for (int number : numbers) {
            if (isEven.and(greaterThan5).test(number)) {
                System.out.println(number);
            }
        }

        System.out.println("\nEven OR greater than 5:");
        for (int number : numbers) {
            if (isEven.or(greaterThan5).test(number)) {
                System.out.println(number);
            }
        }

        System.out.println("\nNOT even:");
        for (int number : numbers) {
            if (isEven.negate().test(number)) {
                System.out.println(number);
            }
        }
    }
}


*/
