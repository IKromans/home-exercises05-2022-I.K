package io.codelex.oop.exercise6;

public class Parcel implements Validatable {

    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > 300 || xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Package size does not match allowed size!");
            isExpress = false;
        } else if (weight < 30.0 && weight > 15) {
            System.out.println("Package is more than 15 units of weigth, it will be standart delivery!");
            isExpress = false;
        } else if (weight < 15) {
            System.out.println("Express delivery!!");
            isExpress = true;
        }
        return isExpress;
    }
}
