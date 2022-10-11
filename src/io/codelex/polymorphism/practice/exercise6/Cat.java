package io.codelex.polymorphism.practice.exercise6;

public class Cat extends  Felime{

    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");

    }

    @Override
    public void eat(Food food) {

    }
}
