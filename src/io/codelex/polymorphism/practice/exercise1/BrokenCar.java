package io.codelex.polymorphism.practice.exercise1;

public class BrokenCar extends DragRace implements Car{

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 1;
    }

    public void slowDown() {
        currentSpeed += 1;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("Trrr...Pow..Screeeeech!......");
    }
}
