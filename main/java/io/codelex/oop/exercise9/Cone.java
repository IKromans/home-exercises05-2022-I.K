package io.codelex.oop.exercise9;

public class Cone extends threeDShape {

    private int height;
    private int radius;

    public Cone(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * (radius * radius) * height / 3;
    }
}
