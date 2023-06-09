package io.codelex.polymorphism.practice.exercise1;

public class Mercedes implements Car {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 20;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 10;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        Car.super.startEngine();
    }

    @Override
    public String getCarName() {
        return "Mercedes";
    }

}
