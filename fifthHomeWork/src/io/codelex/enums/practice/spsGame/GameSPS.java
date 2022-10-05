package io.codelex.enums.practice.spsGame;

import java.util.Random;
import java.util.Scanner;

public class GameSPS {

    static int gameCount = 0;
    static int userWins = 0;
    static int pcWins = 0;

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Let us begin...");

        while (true) {

            System.out.println("Scissor-Paper-Stone");
            System.out.print("\tYour turn (Enter 's' for scissor, 'p' for paper, 't' for stone, 'q' to quit): ");
            ScissorPaperStone userChoice = ScissorPaperStone.getSPSByChar(input.next().charAt(0));

            if (userChoice.equals(ScissorPaperStone.EXIT)) {
                break;
            }

            Random random = new Random();
            ScissorPaperStone pcChoice = ScissorPaperStone.getSPSByInt(random.nextInt(3));
            System.out.print("\tMy turn: ");
            Thread.sleep(1000);
            System.out.println(pcChoice);

            if (userChoice == ScissorPaperStone.SCISSORS && pcChoice == ScissorPaperStone.STONE) {
                System.out.println("\tStone breaks scissors, I won!");
                pcWins++;
            } else if (userChoice == ScissorPaperStone.PAPER && pcChoice == ScissorPaperStone.SCISSORS) {
                System.out.println("\tScissors cuts paper, I won!");
                pcWins++;
            } else if (userChoice == ScissorPaperStone.STONE && pcChoice == ScissorPaperStone.PAPER) {
                System.out.println("\tPaper covers the stone, I won!");
                pcWins++;
            } else if (userChoice == pcChoice) {
                System.out.println("\tTie!");
            } else {
                System.out.println("\tYou won!");
                userWins++;
            }
            System.out.println();
            Thread.sleep(500);
            gameCount++;
        }

        System.out.println("\nNumber of trials: " + gameCount);
        System.out.println("I won " + pcWins + "(" + String.format("%.2f", getWinPercentage(pcWins)) + "%)." + " You won " + userWins + "(" + String.format("%.2f", getWinPercentage(userWins)) + "%).");
        System.out.println("Bye!");
    }

    private static double getWinPercentage(double count) {
        return count * 100 / gameCount;
    }
}
