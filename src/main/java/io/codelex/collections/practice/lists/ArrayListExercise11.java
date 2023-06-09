package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> drinks = new ArrayList<>();

        //TODO: Add 10 values to list
        Collections.addAll(drinks, "Coffee", "Lemonade", "Wine", "Beer", "Champagne", "Tea", "Milkshake", "Cocktail", "Smoothie", "Water");

        //TODO: Add new value at 5th position
        drinks.set(4, "Juice");

        //TODO: Change value at last position (Calculate last position programmatically)
        drinks.set(drinks.size()-1, "Vodka");

        //TODO: Sort your list in alphabetical order
        Collections.sort(drinks);

        //TODO: Check if your list contains "Foobar" element
        System.out.println(drinks.contains("Foobar"));

        //TODO: Print each element of list using loop
        for(String drink: drinks){
            System.out.print(drink + " ");
        }
    }

}
