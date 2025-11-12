package com.pm.fi_advanced;

import java.util.List;
import java.util.function.Predicate;

class Student {
    String name;
    int age;
    int score;

    Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Score: " + score + ")";
    }
}

public class PrediacteAdvEx1 {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Alice", 20, 90),
            new Student("Arjun", 19, 80),
            new Student("Bob", 22, 76),
            new Student("Charlie", 18, 65),
            new Student("Aditi", 17, 70)
        );

        Predicate<Student> ageAbove18 = s -> s.age > 18;
        Predicate<Student> scoreAbove75 = s -> s.score > 75;
        Predicate<Student> nameStartsWithA = s -> s.name.startsWith("A");

        System.out.println("---- Students age > 18 and score > 75 ----");
        students.stream()
                .filter(ageAbove18.and(scoreAbove75))
                .forEach(System.out::println);

        System.out.println("\n---- Students name starts with A or score > 75 ----");
        students.stream()
                .filter(nameStartsWithA.or(scoreAbove75))
                .forEach(System.out::println);

        System.out.println("\n---- Students name NOT starting with A ----");
        students.stream()
                .filter(nameStartsWithA.negate())
                .forEach(System.out::println);
    }
}



/*Task P3 (Predicate Advanced – Real-World Filtering)
=> Goal
You’ll use multiple Predicates to filter a list of students based on certain conditions.
This will help you understand how Predicate is used in real data processing (like in streams, filters, etc.).

=> Scenario

You have a list of students — each has:
-- a name
-- an age
-- a score (marks out of 100)

You need to:
Create three predicates:

ageAbove18 → student’s age is > 18
scoreAbove75 → student’s score > 75
nameStartsWithA → student’s name starts with “A”

Filter and print:

-> Students who are above 18 AND have score > 75
-> Students who are name starts with A OR score > 75
-> Students who do NOT have name starting with A




Expected Output Example:
---- Students age > 18 and score > 75 ----
Alice (Age: 20, Score: 90)
Arjun (Age: 19, Score: 80)

---- Students name starts with A or score > 75 ----
Alice (Age: 20, Score: 90)
Arjun (Age: 19, Score: 80)
Bob (Age: 22, Score: 76)

---- Students name NOT starting with A ----
Bob (Age: 22, Score: 76)
Charlie (Age: 18, Score: 65)
*/