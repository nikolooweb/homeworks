package io.codelex.polymorphism.practice.exercise1;

public interface Car extends Boost{
    void speedUp();
    void slowDown();
    String showCurrentSpeed();

    String getCarName();
    default void startEngine(){
        System.out.println("Rrrrrrr.....");
    }

    @Override
    default void useNitrousOxideEngine(){
    };

}
