package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age;
        double height, weight;

        name = "Zed A. Shaw";
        age = 35;
        height = 74 * 2.54;
        weight = 180 * 0.453592;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.printf("He's %.2f centimeters tall.", height);
        System.out.println();
        System.out.printf("He's %.2f kilograms heavy.", weight);
        System.out.println();
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.printf("If I add %d, %.2f, and %.2f I get %.2f.", age, height, weight, (age + height + weight));
    }
}