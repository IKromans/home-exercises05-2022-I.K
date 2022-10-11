package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * !!4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * !!5. Print out the car name and speed of the fastest car
 */
public class DragRace implements Car, Boost {

    public static void main(String[] args) {

        List<DragRace> carList = new ArrayList<DragRace>();

        Audi audi = new Audi();
        OldAudi oldAudi = new OldAudi();
        BrokenCar brokenCar = new BrokenCar();
        Bmw bmw = new Bmw();
        Tesla tesla = new Tesla();
        Lexus lexus = new Lexus();
        TunedCar tunedCar = new TunedCar();

        carList.add(audi);
        carList.add(oldAudi);
        carList.add(brokenCar);
        carList.add(bmw);
        carList.add(tesla);
        carList.add(lexus);
        carList.add(tunedCar);

        for (int i = 1; i <= 10; i++)
            for (int j = 1; j < carList.size(); j++) {
                if (j == 3) {
                    carList.get(j).useNitrousOxideEngine();
                } else {
                    carList.get(j).speedUp();
                }
                System.out.println(carList.get(j).showCurrentSpeed());
            }
    }

    @Override
    public void useNitrousOxideEngine() {

    }

    @Override
    public void speedUp() {

    }

    @Override
    public void slowDown() {

    }

    @Override
    public void startEngine() {

    }
}
