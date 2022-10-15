package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        BigDecimal result = radius.multiply(radius).multiply(BigDecimal.valueOf(Math.PI));
        MathContext m = new MathContext(4);
        return result.round(m);
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.multiply(h).divide(BigDecimal.valueOf(2), RoundingMode.CEILING);
    }
}
