package io.codelex.oop.exercise6;

public class Parcel implements Validatable {

    private final int X_LENGTH;
    private final int Y_LENGTH;
    private final int Z_LENGTH;
    private final float WEIGHT;
    private boolean isExpress;


    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.X_LENGTH = xLength;
        this.Y_LENGTH = yLength;
        this.Z_LENGTH = zLength;

        this.WEIGHT = weight;
    }

    @Override
    public boolean validate() {
        if (X_LENGTH + Y_LENGTH + Z_LENGTH > 300 || X_LENGTH < 30 || Y_LENGTH < 30 || Z_LENGTH < 30) {
            System.out.println("Package size does not match allowed size!");
            isExpress = false;
        } else if (WEIGHT < 30.0 && WEIGHT > 15) {
            System.out.println("Package is more than 15 units of weigth, it will be standart delivery!");
            isExpress = false;
        } else if (WEIGHT < 15) {
            System.out.println("Express delivery!!");
            isExpress = true;
        }
        return isExpress;
    }
}
