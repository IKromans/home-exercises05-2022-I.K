package io.codelex.oop.exercise9;

public class Triangle extends Shape {

    private int length;

    public Triangle(int length) {
        this.length = length;

    }

    @Override
    public int calculatePerimeter() {
        return length * 3;

    }

    @Override
    public double calculateArea() {
        return 1.73 * length * length / 4;

    }
}
