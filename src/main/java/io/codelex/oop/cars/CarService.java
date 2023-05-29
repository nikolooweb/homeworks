package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> returnCars() {
        return cars;
    }

    public List<Car> getCarsByEngineType(EngineType engineType) {
        return cars.stream().filter(Car -> Car.getEngineType().equals(engineType)).collect(Collectors.toList());
    }

    public List<Car> getCarsBefore1999() {
        return cars.stream().filter(Car -> Car.getYearOfManufacture() < 1999).collect(Collectors.toList());
    }

    public Car getCheapestCar() {
        return cars.stream().min(Comparator.comparing(Car::getPrice)).get();
    }

    public Car getMostExpensiveCar() {
        return cars.stream().max(Comparator.comparing(Car::getPrice)).get();
    }

    public List<Car> sortCarsByPrice(String howToSort) {
        Comparator<Car> comparator = null;
        if (howToSort.equals("ascending")) {
            comparator = Comparator.comparing(Car::getPrice);
        } else if (howToSort.equals("descending")) {
            comparator = Comparator.comparing(Car::getPrice).reversed();
        }
        assert comparator != null;
        return cars.stream().sorted(comparator).collect(Collectors.toList());

    }

    public boolean exist(Car car) {
        if (cars.contains(car)) {
            return true;
        }
        return false;
    }

    public List<Car> carsByManufacter(Manufacter manufacter) {
        return cars.stream().filter(Car -> Car.getManufacter().equals(manufacter)).collect(Collectors.toList());
    }

    public List<Car> carsFromEstablishmentYearToGiven(int year) {
        return cars.stream().filter(Car -> Car.getManufacter().getYear() < year).collect(Collectors.toList());
    }

}
