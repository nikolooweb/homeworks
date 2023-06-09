package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime{
    String livingRegion;
    public Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.livingRegion = livingRegion;
    }

    @Override
    void makeSound() {
        System.out.println("ROOAARRRR!!!");
    }

    @Override
    void eatFood() {

    }
}
