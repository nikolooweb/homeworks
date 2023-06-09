package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal{
    public Mouse(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {

    }

    @Override
    void eatFood() {

    }
}
