package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (only Nr.5 or 3 is  allowed :D): ");
        int nrOfRows = input.nextInt();
        int divider = 0;
        if (nrOfRows > 5) {
            divider += (nrOfRows - 5) * 2;
        } else if (nrOfRows < 5) {
            divider = (5 - nrOfRows) * 2;
        } else {
            divider = 5 - 3;
        }
        final int rows = nrOfRows * 4;
        final int columns = 32;
        final int slash = columns / divider;

        for (int i = 1; i <= rows; i += 4) {
            for (int j = i; j <= slash; j++) {
                System.out.print("/");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= slash; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
