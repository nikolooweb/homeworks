package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        BigDecimal pi = new BigDecimal(Math.PI);
        return ((radius.pow(2)).multiply(pi)).doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        return (length.multiply(width)).doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        return (base.multiply(h).multiply(BigDecimal.valueOf(0.5))).doubleValue();
    }
}
