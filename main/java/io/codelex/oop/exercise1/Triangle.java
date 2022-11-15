package io.codelex.oop.exercise1;

public class Triangle extends Shape {

    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return this.width * this.height / 2;
    }

    @Override
    public int getPerimeter() {
        return this.height * 3;
    }
}
