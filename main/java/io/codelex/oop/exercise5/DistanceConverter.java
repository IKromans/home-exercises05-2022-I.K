package io.codelex.oop.exercise5;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome! Length Converter!\n");
        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("(0) to convert metres to yards");
            System.out.println("(1) to convert yards to metres");
            System.out.println("(2) to convert centimetres to inches");
            System.out.println("(3) to convert inches to centimetres");
            System.out.println("(4) to convert kilometres to miles");
            System.out.println("(5) to convert miles to kilometres");
            System.out.println("(6) to Exit");

            int n = keyboard.nextInt();
            switch (n) {
                case 0 -> metresToYards(keyboard);
                case 1 -> yardsToMetres(keyboard);
                case 2 -> centimetresToInches(keyboard);
                case 3 -> inchesToCentimetres(keyboard);
                case 4 -> kilometresToMiles(keyboard);
                case 5 -> milesToKilometres(keyboard);
                case 6 -> System.exit(6);
                default -> {
                }
            }
        }
    }

    private static void milesToKilometres(Scanner keyboard) {
        MeasurementConverter length = new MeasurementConverter();
        System.out.print("Enter length in miles: ");
        System.out.println(length.convert(keyboard.nextInt(), ConversionType.MILES_TO_KILOMETERS) + " km\n");
    }

    private static void kilometresToMiles(Scanner keyboard) {
        MeasurementConverter length = new MeasurementConverter();
        System.out.print("Enter length in kilometres: ");
        System.out.println(length.convert(keyboard.nextInt(), ConversionType.KILOMETERS_TO_MILES) + " miles\n");
    }

    private static void inchesToCentimetres(Scanner keyboard) {
        MeasurementConverter length = new MeasurementConverter();
        System.out.print("Enter length in inches: ");
        System.out.println(length.convert(keyboard.nextInt(), ConversionType.INCHES_TO_CENTIMETERS) + " cm\n");
    }

    private static void centimetresToInches(Scanner keyboard) {
        MeasurementConverter length = new MeasurementConverter();
        System.out.print("Enter length in centimetres: ");
        System.out.println(length.convert(keyboard.nextInt(), ConversionType.CENTIMETERS_TO_INCHES) + " inches\n");
    }

    private static void yardsToMetres(Scanner keyboard) {
        MeasurementConverter length = new MeasurementConverter();
        System.out.print("Enter length in yards: ");
        System.out.println(length.convert(keyboard.nextInt(), ConversionType.YARDS_TO_METERS) + " m\n");
    }

    private static void metresToYards(Scanner keyboard) {
        MeasurementConverter length = new MeasurementConverter();
        System.out.print("Enter length in metres: ");
        System.out.println(length.convert(keyboard.nextInt(), ConversionType.METERS_TO_YARDS) + " yards\n");

    }
}
