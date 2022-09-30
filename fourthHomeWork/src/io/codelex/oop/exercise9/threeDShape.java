package io.codelex.oop.exercise9;

public abstract class threeDShape extends Shape{

    public abstract double calculateVolume();

    @Override
    public int calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
