package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal{

    public Mouse(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
    }

    @Override
    public void makeSound() {
        System.out.println("squeak..squeak");
    }

    @Override
    public void eat(Food food) {
    }
}
