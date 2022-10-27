package io.codelex.classesandobjects.practice.date;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date(0, 0, 0);

        System.out.println("Enter month (1-12) :");
        date.setMonths(input.nextInt());

        System.out.println("Enter day (1-31) :");
        date.setDays(input.nextInt());

        System.out.println("Enter year :");
        date.setYears(input.nextInt());

        date.displayDate();
    }
}
