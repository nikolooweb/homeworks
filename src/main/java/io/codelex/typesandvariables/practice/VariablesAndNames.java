package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven;
        double seatsInACar, carpoolCapacity, averagePassengersPerCar;

        cars = 100;
        seatsInACar = 4.0;
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers;
        carpoolCapacity = drivers * seatsInACar;
        averagePassengersPerCar = (double)(passengers / drivers);

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.printf("We need to put about %.2f in each car.", averagePassengersPerCar);
    }
}