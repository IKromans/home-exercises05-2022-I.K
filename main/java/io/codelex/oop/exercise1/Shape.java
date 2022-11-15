package io.codelex.oop.exercise1;

public abstract class Shape {

    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract int getArea();


    public abstract int getPerimeter();

}
