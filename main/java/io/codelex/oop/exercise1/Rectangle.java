package io.codelex.oop.exercise1;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return this.height * this.width;
    }

    @Override
    public int getPerimeter() {
        return (this.height + this.width) * 2;
    }


}
