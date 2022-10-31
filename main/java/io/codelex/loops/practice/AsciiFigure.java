package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row count : ");
        int rows = input.nextInt();
        final int columns = (rows - 1) * 8;
        for (int i = 0; i <= columns; i += 8) {
            for (int j = 1; j <= (columns - i) / 2; j++) {
                System.out.print("/");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int g = 1; g <= (columns - i) / 2; g++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
