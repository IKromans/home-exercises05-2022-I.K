package io.codelex.practice.exercise1;

import java.util.Scanner;

public class WorkHourCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first date (dd/MM/yy):");
        String firstDate = input.nextLine();

        System.out.println("Enter second date date (dd/MM/yy):");
        String secondDate = input.nextLine();

        Calculator calculator = new Calculator(firstDate, secondDate);
    }
}
