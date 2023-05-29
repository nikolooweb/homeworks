package io.codelex.oop;

public class Triangle extends Shape{
    private int aSide;
    public Triangle(int aSide){
        this.aSide = aSide;
    }
    @Override
    double calculatePerimeter() {
        return aSide*3;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(3)*Math.pow(aSide, 2)/(double)4;
    }
}
