package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public double converter(double value, ConversionType conversionType){
        return conversionType.conversionNumber * value;
    }

}
