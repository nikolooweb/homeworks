package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car{
    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed += 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public String getCarName() {
        return "Lexus";
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }


    @Override
    public void startEngine() {
        Car.super.startEngine();
    }
}
