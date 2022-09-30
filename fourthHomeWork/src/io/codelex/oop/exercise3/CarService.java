package io.codelex.oop.exercise3;

import java.util.ArrayList;

public class CarService {
    public static void main(String[] args) {
        Car audi1 = new Car("Audi", "100", 7900.00, 1994, EngineType.V6);
        Car audi2 = new Car("Audi", "200", 18700.00, 1990, EngineType.V8);
        Car audi3 = new Car("Audi", "A6", 8000.00, 2002, EngineType.V6);
        Car audi4 = new Car("Audi", "V8", 12900.00, 1994, EngineType.V8);
        Car audi5 = new Car("Audi", "S3", 45000.00, 2022, EngineType.S3);
        Car audi6 = new Car("Audi", "Q7", 36990.00, 2012, EngineType.V12);
        Car audi7 = new Car("Audi", "S4", 15700.00, 1994, EngineType.S4);
        ArrayList<String> cars = new ArrayList<>();

        cars.add(String.valueOf(audi1));
        cars.add(String.valueOf(audi2));
        cars.add(String.valueOf(audi3));
        cars.add(String.valueOf(audi4));
        cars.add(String.valueOf(audi5));
        cars.add(String.valueOf(audi6));
        cars.add(String.valueOf(audi7));

        System.out.println(cars);

        System.out.println(cars.stream().filter(EngineType.V12).toList());


//      i think it's not working as meant to =(
    }

//    public List<Car> getEngine(EngineType engineType) {
//        return cars.stream()
//                .filter(car -> car.getEngineType() == engineType)
//                .toList();
//    }

}
