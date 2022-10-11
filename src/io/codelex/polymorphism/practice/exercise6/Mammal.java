package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal{

    public System livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
    }
}
