package io.codelex.oop.exercise7_8;

import java.util.Objects;

public class Laptop extends Computer {

    int battery;


    public Laptop(double processor, int ram, String graphicsCard, String company, String model, int battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery + " mAh";
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery=" + battery +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
