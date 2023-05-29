package io.codelex.oop;

public class Hexagon extends Shape{

    private int aSide;

    public Hexagon(int aSide){
        this.aSide = aSide;
    }
    @Override
    double calculatePerimeter() {
        return aSide * 6;
    }

    @Override
    double calculateArea() {
        return (double)3*Math.sqrt(3)/(double)2*Math.pow(aSide,2);
    }
}
