package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrOfTenNr = new int[10];
        for (int i = 0; i < 10; i++) {
            int ranNr = random.nextInt(101);
            while (ranNr == 0) {
                ranNr = random.nextInt(101);
            }
            arrOfTenNr[i] = ranNr;
        }

        int[] arrOfTenNrCopy = new int[10];
        System.arraycopy(arrOfTenNr, 0, arrOfTenNrCopy, 0, 10);

        arrOfTenNr[arrOfTenNr.length - 1] = -7;

        System.out.print("Array 1: ");
        for (int j : arrOfTenNr) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.print("Array 2: ");
        for (int j : arrOfTenNrCopy) {
            System.out.print(j + " ");
        }
    }
}
