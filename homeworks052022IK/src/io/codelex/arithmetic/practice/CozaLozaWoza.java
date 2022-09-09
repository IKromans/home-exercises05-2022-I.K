package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {

        for (int i = 1; i <= 110; i++) {
            if (i % 105 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 21 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 15 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 11 == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
