package io.codelex.polymorphism.practice.exercise1;

public class TunedCar extends DragRace implements Car, Boost{

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 21;
    }

    public void slowDown() {
        currentSpeed += 21;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 38;
    }

    public void startEngine() {
        System.out.println("....sssssssSSSSSSSSTTUUTUTUutuututuu.....");
    }
}
