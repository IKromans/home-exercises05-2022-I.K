package io.codelex.classesandobjects.practice.carOdo;

import java.util.Scanner;

public class LitresPerKilometer {
    public static void main(String[] args) {
        double startKilometers;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter start ODO: ");
        startKilometers = scan.nextDouble();

        Car car = new Car(startKilometers);

        System.out.print("Fill up, enter mileage: ");
        double mileage = scan.nextDouble();

        System.out.print("Fill up, enter litres: ");
        double litres = scan.nextDouble();

        car.fillUp(mileage, litres);

        System.out.println("Litres per 100 km are " + car.calculateConsumption());

        if (car.isGasHog()) {
            System.out.println("Car is not environmentally friendly!");
        } else if (car.isEconomyCar()) {
            System.out.println("Car is economical!");
        }
    }
}
