package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceAndTIme {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);
        System.out.println("Test Data");
        System.out.print("Input distance in metres:");
        int distance = numbers.nextInt();
        System.out.print("Input hours:");
        int hours = numbers.nextInt();
        System.out.print("Input minutes:");
        int minutes = numbers.nextInt();
        System.out.print("Input seconds:");
        int seconds = numbers.nextInt();
        System.out.print("Expected output:");

        int timeInSeconds = hours * 3600 + minutes * 60 + seconds;
        double metresPerSecond = (double) distance / timeInSeconds;
        double kmPerHour = metresPerSecond * 3.6;
        double milesPerHour = (metresPerSecond * 2.2369);

        DecimalFormat df = new DecimalFormat("0.00000000");

        System.out.println("Your speed in meters/second is " + df.format(metresPerSecond));
        System.out.println("Your speed in km/h is " + df.format(kmPerHour));
        System.out.println("Your speed in miles/h is " + df.format(milesPerHour));

    }
}
