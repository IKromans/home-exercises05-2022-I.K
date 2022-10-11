package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal{

    public Zebra(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
    }

    @Override
    public void makeSound() {
        System.out.println("hee-haw");
    }

    @Override
    public void eat(Food food) {
    }
}
