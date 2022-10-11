package io.codelex.polymorphism.practice.exercise1;

public class OldAudi extends DragRace implements Car{

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 4;
    }

    public void slowDown() {
        currentSpeed += 4;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
        System.out.println("VrumVrumVrummmm.....");
    }
}
