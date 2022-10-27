package io.codelex.classesandobjects.practice.fuelGauge;

public class FuelGauge {
    int fuelAmount;
    static final int MAX_LITRES = 70;

    public FuelGauge() {
    }

    public FuelGauge(int fuelAmount) {
        if (fuelAmount <= MAX_LITRES) {
            this.fuelAmount = fuelAmount;
        } else {
            this.fuelAmount = MAX_LITRES;
        }
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void addFuelAmount() {
        if (fuelAmount < MAX_LITRES) {
            fuelAmount++;
        }
    }

    public void burnFuelAmount() {
        if (fuelAmount > 0) {
            fuelAmount--;
        }
    }
}
