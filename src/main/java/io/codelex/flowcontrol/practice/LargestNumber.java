package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("1st number is the largest");
        } else if (num1 <= num2 && num3 <= num2) {
            System.out.println("2nd number is the largest.");
        } else {
            System.out.println("3rd number is the largest.");
        }
    }

}
