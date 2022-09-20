package io.codelex.classesandobjects.practice.carOdo;

public class Car {
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
        return (calculateConsumption() > 15);
    }

    public boolean isEconomyCar() {
        return (calculateConsumption() < 5);
    }
}
