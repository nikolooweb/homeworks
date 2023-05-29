package io.codelex.oop;

public class Rectangle extends Shape{

    private int aSide;
    public Rectangle(int aSide){
        this.aSide = aSide;
    }
    @Override
    double calculatePerimeter() {
        return aSide * 4;
    }

    @Override
    double calculateArea() {
        return aSide * aSide;
    }
}
