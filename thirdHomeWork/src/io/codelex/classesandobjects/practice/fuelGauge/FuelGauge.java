package io.codelex.classesandobjects.practice.fuelGauge;

public class FuelGauge {
    int fuelAmount;
    final int maxLiters = 70;

    public FuelGauge() {
    }

    public FuelGauge(int fuelAmount) {
        if (fuelAmount <= maxLiters) {
            this.fuelAmount = fuelAmount;
        } else {
            this.fuelAmount = maxLiters;
        }
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void addFuelAmount() {
        if (fuelAmount < maxLiters) {
            fuelAmount++;
        }
    }

    public void burnFuelAmount() {
        if (fuelAmount > 0) {
            fuelAmount--;
        }
    }
}
