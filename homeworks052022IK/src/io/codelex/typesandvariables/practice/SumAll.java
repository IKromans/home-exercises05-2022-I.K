package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);
        System.out.println("SINGLE DIGIT CALCULATOR");
        System.out.println("Please, enter number:");
        int readNum1 = numbers.nextInt();

        System.out.println("Please, enter second number");
        int readNum2 = numbers.nextInt();

        System.out.println("Enter one more number");
        int readNum3 = numbers.nextInt();

        System.out.println("...and last one");
        int readNum4 = numbers.nextInt();

        int sumOfAllNumbers = readNum1 + readNum2 + readNum3 + readNum4;
        System.out.println("Sum of all entered numbers is: " + sumOfAllNumbers);
    }
}
