package io.codelex.oop.shapes;

public class Triangle extends Shape{
    private double side;
    private double base;

    public Triangle(int numSides, int base, int side) {
        super(numSides);
        this.side = side;
        this.base = base;
    }

    @Override
    public double getArea() {
        return Math.sqrt(Math.pow(side,2) - Math.pow(base/2,2))*base/2;
    }

    @Override
    public double getPerimeter() {
        return (side*2) + base;
    }
}
