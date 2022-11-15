package io.codelex.oop.exercise9;

public class Hexagon extends Shape {

    private int length;

    public Hexagon(int length) {
        this.length = length;

    }

    @Override
    public int calculatePerimeter() {
        return length * 6;

    }

    @Override
    public double calculateArea() {
        return (6 * (length * length)) / (4 * Math.tan(Math.PI / 6));

    }
}
