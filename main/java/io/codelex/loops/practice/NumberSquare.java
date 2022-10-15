package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Min ? ");
        int nrMin = input.nextInt();
        System.out.print("Max ? ");
        int nrMax = input.nextInt();

        if (nrMax < nrMin) {
            System.out.println("Try again later!");
        } else {
            for (int i = nrMin; i <= nrMax; i++) {
                for (int j = i; j <= nrMax; j++) {
                    System.out.print(j + " ");
                }
                for (int l = nrMin; l < i; l++) {
                    System.out.print(l + " ");
                }
                System.out.println();
            }
        }
    }
}
