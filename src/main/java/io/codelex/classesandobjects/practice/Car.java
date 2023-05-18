package io.codelex.classesandobjects.practice;

public class Car {
    private double startOdo;
    private double endingOdo;
    private double liters;

    public Car(double startOdo) {
        this.startOdo = startOdo;
    }

    public double calculateConsumption() {
        return liters / (endingOdo - startOdo) * 100;
    }

    public boolean gasHog() {
        return calculateConsumption() > 15;
    }

    public boolean EconomyCar() {
        return calculateConsumption() < 5;
    }

    public void fillUp(int mileage, double liters) {
        this.endingOdo = mileage;
        this.liters = liters;
    }

    public static void main(String[] args) {

        Car car1 = new Car(10000);
        Car car2 = new Car(5000);

        car1.fillUp(20000, 345);
        System.out.println("First car --- " + car1.calculateConsumption() + "l/100km");
        System.out.println("First car has low consumption: " + car1.EconomyCar());


    }
}
