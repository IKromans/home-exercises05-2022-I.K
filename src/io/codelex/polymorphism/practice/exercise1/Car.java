package io.codelex.polymorphism.practice.exercise1;

public interface Car {

    Integer currentSpeed = 0;

    void speedUp();

    void slowDown();

    default String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    void startEngine();

}
