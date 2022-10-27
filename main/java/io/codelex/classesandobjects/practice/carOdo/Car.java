package io.codelex.classesandobjects.practice.carOdo;

public class Car {
    static private final int MAX_CONSUMPTION = 15;
    static private final int MIN_CONSUMPTION = 5;
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }

    public double calculateConsumption() {
        return liters / ((endKilometers - startKilometers) / 100);
    }

    public void fillUp(double mileage, double liters) {
        endKilometers = mileage;
        this.liters = liters;
    }

    public boolean isGasHog() {
        return calculateConsumption() > MAX_CONSUMPTION;
    }

    public boolean isEconomyCar() {
        return calculateConsumption() < MIN_CONSUMPTION;
    }
}
