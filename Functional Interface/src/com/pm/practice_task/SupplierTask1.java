package com.pm.practice_task;

import java.util.function.Supplier;

public class SupplierTask1 {

	public static void main(String[] args) {
		// Supplier takes no input, but supplies a value when called
        Supplier<Double> randomNumber = () -> Math.random();

        // Print 5 random numbers
        for (int i = 0; i < 5; i++) {
            System.out.println(randomNumber.get());
        }
		
		

	}

}

/*Task 4: Using a Lambda with Supplier

Problem:
Write a Java program that uses a Supplier<Double> lambda to generate and return a random number between 0 and 1.

Your program should:
Create a Supplier<Double> that uses Math.random().
Call it multiple times (e.g., 5 times) to print random numbers.

Example expected output:
0.371829573
0.820394812
0.146782931
0.982174013
0.561937263


*/
