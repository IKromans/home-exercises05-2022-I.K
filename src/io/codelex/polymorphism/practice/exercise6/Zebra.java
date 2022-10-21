package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal{

    public Zebra(String animalName, Double animalWeight, String livingRegion) {
        super(animalName,animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> hee-haw");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")){
            throw new IllegalArgumentException((this.getClass().getSimpleName() + "s are not eating that type of food!"));
        }else {
            super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
        }
    }
}