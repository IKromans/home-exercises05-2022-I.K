package io.codelex.classesandobjects.practice.fuelGauge;

public class Odometer {
    final double maxOdo = 999999;
    final int fuelConsumption = 10;
    private int startOdo;
    private int endOdo;

    FuelGauge fuelGauge;

    public Odometer(int endOdo, FuelGauge fuelGauge) {
        this.startOdo = endOdo;
        this.endOdo = endOdo;
        this.fuelGauge = fuelGauge;
    }

    public int getEndOdo() {
        return endOdo;
    }

    public void addOdo() {
        if (endOdo < maxOdo) {
            endOdo++;
        } else {
            endOdo = 0;
        }

        int mileage = startOdo - endOdo;
        if (mileage % fuelConsumption == 0) {
            fuelGauge.burnFuelAmount();
        }
    }
}
