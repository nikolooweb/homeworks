package io.codelex.oop.shapes;

import javax.crypto.spec.RC2ParameterSpec;

public class ShapeAppTest {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3,4,6);
        Rectangle rectangle1 = new Rectangle(4, 5,4);
        System.out.println("Triangle area: " + triangle1.getArea() + " perimeter: " + triangle1.getPerimeter());
        System.out.println("Rectangle area: " + rectangle1.getArea() + " perimeter: " + rectangle1.getPerimeter());
        System.out.println(rectangle1.getNumSides());

    }
}
