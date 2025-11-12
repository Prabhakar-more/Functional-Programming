package com.pm.fi_methods;

import java.util.function.Predicate;
import java.util.List;

public class PredicateAllMethodsExample {

    public static void main(String[] args) {

        // List of words to test
        List<String> words = List.of("Apple", "Ant", "Banana", "Hi", "", "Hello", "Apple");

        // test() — base predicate
        Predicate<String> startsWithA = word -> word.startsWith("A");
        Predicate<String> lengthGreaterThan3 = word -> word.length() > 3;

        System.out.println("---- test() ----");
        for (String w : words) {
            System.out.println(w + " starts with A? " + startsWithA.test(w));
        }

        // and() — both conditions must be true
        Predicate<String> andPredicate = startsWithA.and(lengthGreaterThan3);
        System.out.println("\n---- and() ----");
        for (String w : words) {
            System.out.println(w + " -> " + andPredicate.test(w));
        }

        // or() — at least one condition must be true
        Predicate<String> orPredicate = startsWithA.or(lengthGreaterThan3);
        System.out.println("\n---- or() ----");
        for (String w : words) {
            System.out.println(w + " -> " + orPredicate.test(w));
        }

        // negate() — reverse the condition
        Predicate<String> notStartsWithA = startsWithA.negate();
        System.out.println("\n---- negate() ----");
        for (String w : words) {
            System.out.println(w + " starts with A? " + startsWithA.test(w)
                    + " | negate() -> " + notStartsWithA.test(w));
        }

        // isEqual() — true if equal to a specific value
        Predicate<String> isEqualToApple = Predicate.isEqual("Apple");
        System.out.println("\n---- isEqual() ----");
        for (String w : words) {
            System.out.println(w + " equals 'Apple'? " + isEqualToApple.test(w));
        }

        //  Predicate.not() — opposite of another predicate (Java 11+)
        Predicate<String> isEmpty = s -> s.isEmpty();
        Predicate<String> isNotEmpty = Predicate.not(isEmpty);
        System.out.println("\n---- Predicate.not() ----");
        for (String w : words) {
            System.out.println("'" + w + "'" + " is not empty? " + isNotEmpty.test(w));
        }
    }   
}

