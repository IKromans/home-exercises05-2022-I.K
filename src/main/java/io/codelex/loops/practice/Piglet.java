package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {

        int playerScores = 0;
        int dice;
        char repeat;
        String input;
        final Scanner keyboard = new Scanner(System.in);
        final Random rand = new Random();

        System.out.println("Welcome to Piglet!");

        do {
            dice = rand.nextInt(6) + 1;
            System.out.println("You rolled a " + dice + "!");
            if (dice == 1) {
                playerScores = 0;
                break;
            } else {
                playerScores += dice;
                System.out.print("Roll again? y/n ");
                input = keyboard.nextLine();
                repeat = input.charAt(0);

                if (repeat == 'n')
                    break;
            }
        }
        while (dice != 1);
        System.out.println("You got " + playerScores + " points.");
    }
}