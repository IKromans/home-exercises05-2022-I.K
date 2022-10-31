package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        do {
            int lower = 1;
            int upper = 100;
            int r = (int) (Math.random() * (upper - lower)) + lower;

            Scanner number = new Scanner(System.in);
            System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
            int input = number.nextInt();

            if (input == r) {
                System.out.println("You guessed it!  What are the odds?!?");
            } else if (input < r) {
                System.out.println("Sorry, you are too low.  I was thinking of " + r + ".");
            } else {
                System.out.println("Sorry, you are too high.  I was thinking of " + r + ".");
            }
            System.out.println();
        }
        while (true);
    }
}
