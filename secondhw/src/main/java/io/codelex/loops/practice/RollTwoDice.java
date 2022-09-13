package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {

        System.out.print("Enter desired sum: ");
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int randomNrSum;
        int number = input.nextInt();
        do {
            int nr1 = 1 + random.nextInt(6);
            int nr2 = 1 + random.nextInt(6);
            randomNrSum = nr1 + nr2;
            System.out.println(nr1 + " and " + nr2 + " = " + randomNrSum);
        } while (number != randomNrSum);
    }
}
