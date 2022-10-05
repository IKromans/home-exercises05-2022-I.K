package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        final int lineLength = 30;

        Scanner text = new Scanner(System.in);

        do {
            System.out.println("Enter first word: ");
            String word1 = text.nextLine();
            System.out.println("Enter second word: ");
            String word2 = text.nextLine();

            int dotLength = lineLength - word1.length() - word2.length();

            System.out.print(word1);
            for (int i = 0; i < dotLength; i++) {
                System.out.print(".");
            }
            System.out.println(word2 + "\n");

        }
        while (true);
    }
}
