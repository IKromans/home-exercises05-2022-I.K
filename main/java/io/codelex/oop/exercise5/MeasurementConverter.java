package io.codelex.oop.exercise5;

public class MeasurementConverter {

    public double convert(double value, ConversionType conversionType) {
        return value * conversionType.getRatio();
    }
}
