package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal{

    public Mouse( String animalName, Double animalWeight,String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("> squeak..squeak");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")){
            throw new IllegalArgumentException("Mouse are not eating that type of food!");
        }else {
            super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
        }
    }
}