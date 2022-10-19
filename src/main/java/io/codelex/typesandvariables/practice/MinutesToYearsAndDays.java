package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {

        do {
            int minutesInYear = 60 * 24 * 365;
            short minutesInDays = 60 * 24;
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter minutes.");
            int minutes = in.nextInt();
            System.out.println(minutes + " minutes is approximately " + minutes / (double) minutesInYear + " years and " + minutes / (double) minutesInDays + " days.");
            System.out.println();
        } while (true);
    }
}
