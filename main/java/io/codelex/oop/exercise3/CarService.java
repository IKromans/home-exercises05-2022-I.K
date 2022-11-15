package io.codelex.oop.exercise3;

import java.util.*;

public class CarService {

    final List<Car> carsList;

    public CarService() {
        carsList = new ArrayList<>();
    }

    public void addCars(Car car){
        carsList.add(car);
    }

    public void removeCars(Car car){
        carsList.remove(car);
    }

    public List<Car> carEngineList(EngineType engineType){
        return carsList.stream()
                .filter(car -> car.getEngineType() == engineType)
                .toList();
    }

    public List<Car> productBefore(int year){
        return carsList.stream()
                .filter(car -> car.getYearOfManufacture() < year)
                .toList();
    }

    public Car mostExpensive(){
        carsList.sort(Comparator.comparing(Car::getPrice).reversed());
        return carsList.get(0);
    }

    public Car mostCheapest(){
        carsList.sort(Comparator.comparing(Car::getPrice));
        return carsList.get(0);
    }

    public List<Car> manufacturedAtLeast(int count){
        return carsList.stream()
                .filter(car -> car.getManufactureList().size() >= count )
                .toList();
    }

    public String sortedByYear(){
        carsList.sort(Comparator.comparing(Car::getYearOfManufacture));
        return carsList.toString();
    }

    public List<Car> specificBrand(String brand){
        return carsList.stream()
                .filter(car -> car.getName() == brand)
                .toList();
    }

    public List<Car> specificManufacturer(String manufacturer){
        return carsList.stream()
                .filter(car -> car.getManufactureList().get(0).getName().equals(manufacturer))
                .toList();
    }
}
