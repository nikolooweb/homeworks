package io.codelex.oop.imperialToMetric;

public class Test {
    public static void main(String[] args) {


        MeasurementConverter test1 = new MeasurementConverter();
        double result = test1.converter(294, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(result);

        double result1 = test1.converter(100, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(result1);
    }
}
