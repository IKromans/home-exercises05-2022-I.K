package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Please enter two numbers!");
        System.out.print("Enter first number: ");
        int a = numberScanner.nextInt();
        System.out.print("Enter second number: ");
        int b = numberScanner.nextInt();

        if (a == 15 || b == 15 || a - b == 15 || b - a == 15 || a + b == 15) {
            System.out.println(true);
        }
    }
}
