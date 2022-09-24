package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter desired sum: ");
        int randomNrSum = 0;
        int number = input.nextInt();

        while (number < 2 || number > 12) {
            System.out.print("Impossible to roll with two dices, try again: ");
            number = input.nextInt();
        }
        while (number != randomNrSum) {
            int nr1 = 1 + random.nextInt(6);
            int nr2 = 1 + random.nextInt(6);
            randomNrSum = nr1 + nr2;
            System.out.println(nr1 + " and " + nr2 + " = " + randomNrSum);
        }
    }
}
