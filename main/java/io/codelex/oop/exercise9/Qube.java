package io.codelex.oop.exercise9;

public class Qube extends threeDShape{

    public int side;

    public Qube(int side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }
}
