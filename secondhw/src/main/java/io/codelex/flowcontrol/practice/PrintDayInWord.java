package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {

        Scanner dayNumber = new Scanner(System.in);
        System.out.print("Enter day number from 0 to 6:");
        int nr = dayNumber.nextInt();

        if (nr >= 0) {
            if (nr <= 6) {
                switch (nr) {
                    case 0 -> System.out.println("Sunday");
                    case 1 -> System.out.println("Monday");
                    case 2 -> System.out.println("Tuesday");
                    case 3 -> System.out.println("Wednesday");
                    case 4 -> System.out.println("Thursday");
                    case 5 -> System.out.println("Friday");
                    case 6 -> System.out.println("Saturday");
                }
            }
        } else {
            System.out.println("Not a valid day");
        }
    }
}