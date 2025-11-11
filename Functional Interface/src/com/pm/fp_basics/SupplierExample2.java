package com.pm.fp_basics;

import java.util.function.Supplier;

public class SupplierExample2 {
    public static void main(String[] args) {

        String[] names = {"Amit", "Neha", "Ravi", "Priya", "Kiran"};

        Supplier<String> randomName = () -> {
            int index = (int) (Math.random() * names.length);
            return names[index];
        };

        for (int i = 0; i < 5; i++) {
            System.out.println("Random name: " + randomName.get());
        }
    }
}



/*
Explanation

Step 1 — Why (int)(Math.random() * names.length)?

Math.random() → gives a double between 0.0 and 1.0.
Multiplying by names.length (5) gives a number between 0.0 and 5.0.
Casting to (int) converts it into 0, 1, 2, 3, or 4 → valid indices for your array.


Step 2 — Why Supplier is perfect here?

Because:
You are not taking any input, but
You are supplying (returning) a new random name each time you call get().
That’s exactly what a Supplier<T> is meant for.
*/





/*
Create a Supplier<String> that always returns a random name from a list of names ("Amit", "Neha", "Ravi", "Priya", "Kiran").

Print 5 random names using the Supplier.
(Don’t use streams.)
*/
