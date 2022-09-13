package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();
        int l = String.valueOf(n).length();

        if (l > 0 && l <= 19) {
            if (n < 0) {
                n *= -1;
            }
            if (l > 11) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits = 1;
                if (l == 2) {
                    digits = 2;
                } else if (l == 3) {
                    digits = 3;
                } else if (l == 4) {
                    digits = 4;
                } else if (l == 5) {
                    digits = 5;
                } else if (l == 6) {
                    digits = 6;
                } else if (l == 7) {
                    digits = 7;
                } else if (l == 8) {
                    digits = 8;
                } else if (l == 9) {
                    digits = 9;
                } else if (l == 10) {
                    digits = 10;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        } else {
            System.out.println("The number is not a long");
        }
    }

}
