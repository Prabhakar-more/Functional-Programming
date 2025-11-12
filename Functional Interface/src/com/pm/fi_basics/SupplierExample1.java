package com.pm.fi_basics;

import java.util.function.Supplier;

public class SupplierExample1 {
    public static void main(String[] args) {
        // Supplier takes no input, but supplies a value when called
        Supplier<Double> randomNumber = () -> Math.random();

        // Print 5 random numbers
        for (int i = 0; i < 5; i++) {
            System.out.println("Random number: " + randomNumber.get());
        }
    }
}



/*
Supplier
Write a Supplier<Double> that gives you a random number between 1–10.
Call it 3 times and print.
*/
