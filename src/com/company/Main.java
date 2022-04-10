package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to sequence of numbers from A to B calculator (A, A+1, ..., A+B).");
        System.out.println("Impute please value A: ");

        Sequence sq = new Sequence();
        int A = scanner.nextInt();
        sq.A = A;

        System.out.println("Impute please value B: ");
        int B = scanner.nextInt();
        sq.B = B;

        //sq.usable();

        if (A > B) {
            System.out.println("Job completed. 'A' should be less then 'B'.");
        } else {
            sq.sumCalculator();
        }
    }
}
