package com.pm.fi_basics;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {

        // Step 1: Define Consumer
        Consumer<String> printWelcome = name -> System.out.println("Welcome " + name.toUpperCase());

        // Step 2: Create a list of names
        List<String> names = List.of("Amit", "Neha", "Ravi");

        // Step 3: Apply Consumer without streams
        for (String name : names) {
            printWelcome.accept(name);  // Consumer in action
        }
    }
}    


/*
Consumer

Create a Consumer<String> that prints a name in uppercase with "Welcome " before it.

Use it with 3 names in a list ("Amit", "Neha", "Ravi").

*/
