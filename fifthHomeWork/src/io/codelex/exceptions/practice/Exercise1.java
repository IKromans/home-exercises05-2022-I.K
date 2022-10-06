package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            String numerator = null;
            try {
                System.out.print("Enter the numerator: ");
                numerator = scanner.next();
                if (numerator.equals("Q") || numerator.equals("q")) {
                    break;
                }
                int number = Integer.parseInt(numerator);
                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + number / divisor);
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("You enetered bad data \nplease try again");
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("You entered bad data. \nPlease try again.\n");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0\n");
            }
        }
    }
}