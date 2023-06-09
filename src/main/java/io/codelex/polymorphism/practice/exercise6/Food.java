package io.codelex.polymorphism.practice.exercise6;

abstract class Food {
    String name;
    Integer quantity;
    public Food(String foodName, Integer quantity){
        this.quantity = quantity;
        name = foodName;
    }
}
