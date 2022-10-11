package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {

    public String animalName;
    public String animalType;
    public Double animalWeight;
    public Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalWeight=" + animalWeight +
                ", foodEaten=" + foodEaten +
                '}';
    }

    public abstract void makeSound();

    public abstract void eat(Food food);
}
