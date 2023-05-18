package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {

        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculateEnergyDrinkers(NUMBERED_SURVEYED) + " bought at least one energy drink");
        System.out.println(calculatePreferCitrus(NUMBERED_SURVEYED) + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitrus(int numberSurveyed) {
        return calculateEnergyDrinkers(numberSurveyed) * PREFER_CITRUS_DRINKS;
    }

    public static class test {
    }
}
