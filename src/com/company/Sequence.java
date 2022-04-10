package com.company;

public class Sequence {
    /** Write a program that takes from the user two integers A - a (int) and B - b (int), where A <B,
        and then calculates the sum of the sequence of numbers from A to B (A, A + 1, A + 2, ..., B)
        and prints it in the console. When the A <B condition is not met, the program exits by writing
        "Job completed" in the console.
        For example, for A = 4 and B = 11, the program should write the number 60 in the console.
        Get the data from the user in the console using the Scanner class.
        * */

    int A, B;
    int calculator = 0;
    int i = 0;

    void usable() {
        if (A > B) {
            System.out.println("Job completed. 'A' should be less then 'B'.");
        }
    }

    void sumCalculator() {
        while (A + i < B) {
            int sum = A + i;
            calculator = calculator + sum;
            i++;
        }
        calculator = calculator + B;
        System.out.println("Sum of the sequence from " + A + " to " + B + " is equal: " + calculator);
    }
}

