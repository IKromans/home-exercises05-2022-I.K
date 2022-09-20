package io.codelex.classesandobjects.practice.fuelGauge;

import java.util.Scanner;

public class CarGaugeTest {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(0, fuelGauge);

        for (int i = 0; i < fuelGauge.maxLiters; i++) {
            fuelGauge.addFuelAmount();
        }
        while (fuelGauge.getFuelAmount() > 0) {
            odometer.addOdo();
            System.out.println("Mileage is : " + odometer.getEndOdo() + " km");
            System.out.println("Fuel is : " + fuelGauge.getFuelAmount() + " litres");
            if (fuelGauge.fuelAmount == 0) {
                System.out.println("Fuel tank is empty, enter litres to fill up: ");
                Scanner input = new Scanner(System.in);
                fuelGauge.fuelAmount = input.nextInt();
            }
        }
    }
}
