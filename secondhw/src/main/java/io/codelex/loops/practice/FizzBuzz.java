package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter positive number: ");
        int number = input.nextInt();

        System.out.println("Max value? " + number);
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
                if (i % 20 == 0) {
                    System.out.println();
                }
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
                if (i % 20 == 0) {
                    System.out.println();
                }
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");

            } else {
                System.out.print(i + " ");
            }

        }
    }
}
