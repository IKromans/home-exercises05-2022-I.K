package io.codelex.collections.practice.exercise5;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int enteredNumber = input.nextInt();
        int number = enteredNumber;

        while (number != 1 && number != 4) {
            number = isHappyNumber(number);
        }

        if (number == 1) {
            System.out.println(enteredNumber + " Is \"happy\" number!");
        } else if (number == 4) {
            System.out.println(enteredNumber + " Is not \"happy\" number!");
        }
    }

    public static int isHappyNumber(int number) {
        int digitSum = 0;
        int remainingDigit;
        while (number > 0) {
            remainingDigit = number % 10;
            digitSum = digitSum + (remainingDigit * remainingDigit);
            number = number / 10;
            System.out.print(remainingDigit + "^2");
            if (number > 0) {
                System.out.print(" + ");
            } else {
                System.out.print("");
            }
        }
        System.out.print(" = " + digitSum + "\n");
        return digitSum;
    }
}
