package io.codelex.oop.exercise9;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    @Override
    public int calculatePerimeter() {
        return (length + width) * 2;

    }

    @Override
    public double calculateArea() {
        return length * width;

    }
}
