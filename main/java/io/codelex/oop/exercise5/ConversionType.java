package io.codelex.oop.exercise5;

public enum ConversionType {

    METERS_TO_YARDS(1.093613),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_INCHES(2.54),
    INCHES_TO_CENTIMETERS(0.393701),
    KILOMETERS_TO_MILES(0.62137119),
    MILES_TO_KILOMETERS(1.609344);

    private final double ratio;

    ConversionType(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }
}
