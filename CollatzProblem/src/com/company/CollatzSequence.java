package com.company;

import java.util.Scanner;

public class CollatzSequence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the number you want to generate the sequence for:");
            int number = sc.nextInt();
            System.out.print("Collatz Sequence:");
            printCollatz(number);
        }
    }

    public static void printCollatz(int number) {

        if (number == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(number + "-->");

        if (number % 2 == 0) {
            number = number / 2;
        } else {
            number = 3 * number + 1;
        }
        printCollatz(number);
    }

}
