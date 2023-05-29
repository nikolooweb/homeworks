package io.codelex.oop.cars;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        Manufacter opel = new Manufacter("Opel", 1929, "Germany");
        Manufacter ferrari = new Manufacter("Ferrari", 1939, "Italy");
        Manufacter volkswagen = new Manufacter("Volkswagen", 1942, "Germany");
        Manufacter mitsubishi = new Manufacter("Mitsubishi", 1920, "Japan");
        Manufacter ford = new Manufacter("Ford", 1903, "USA");

        Car car1 = new Car("Opel", "Mokka", 19000, 2020, opel, EngineType.I4);
        Car car2 = new Car("Ferrari", "LaFerrari", 500000, 2017, ferrari, EngineType.V12);
        Car car3 = new Car("Volkswagen", "Passat", 10000, 2010, volkswagen, EngineType.I4);
        Car car4 = new Car("Volkswagen", "Beetle", 1000, 1980, volkswagen, EngineType.V6);
        Car car5 = new Car("Mitsubishi", "Carisma", 590, 1991, mitsubishi, EngineType.I4);
        Car car6 = new Car("Mitsubishi", "Eclipse", 2000, 1998, mitsubishi, EngineType.V6);
        Car car7 = new Car("Ford", "Mustang", 8000, 2008, ford, EngineType.V8);


        CarService serviceTest = new CarService();

        serviceTest.addCar(car1);
        serviceTest.addCar(car2);
        serviceTest.addCar(car3);
        serviceTest.addCar(car4);
        serviceTest.addCar(car5);
        serviceTest.addCar(car7);

        List<Car> cars = serviceTest.returnCars();


        System.out.println(serviceTest.getCarsByEngineType(EngineType.I4));
        System.out.println(serviceTest.getCarsBefore1999());
        System.out.println(serviceTest.getMostExpensiveCar().getName());
        System.out.println(serviceTest.getCheapestCar().getName());
        System.out.println(serviceTest.sortCarsByPrice("ascending"));
        System.out.println(serviceTest.sortCarsByPrice("descending"));


        System.out.println(serviceTest.exist(car4));
        System.out.println(serviceTest.exist(car6));

        System.out.println(serviceTest.carsByManufacter(volkswagen));

        System.out.println(serviceTest.carsFromEstablishmentYearToGiven(1910));

    }
}
