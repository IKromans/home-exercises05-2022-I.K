package io.codelex.polymorphism.practice.exercise6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnimalInfoApp {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<Animal> allAnimals = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]");
            String[] inputAnimal = new String[5];
            String[] animalFood;
            inputAnimal = scan.nextLine().toLowerCase().split(" ");
            switch (inputAnimal[0]) {
                case "cat" -> {
                    Cat cat = new Cat(inputAnimal[1], Double.parseDouble(inputAnimal[2]), inputAnimal[3], inputAnimal[4]);
                    cat.makeSound();
                    allAnimals.add(cat);
                }
                case "mouse" -> {
                    Mouse mouse = new Mouse(inputAnimal[1], Double.parseDouble(inputAnimal[2]), inputAnimal[3]);
                    mouse.makeSound();
                    allAnimals.add(mouse);
                }
                case "zebra" -> {
                    Zebra zebra = new Zebra(inputAnimal[1], Double.parseDouble(inputAnimal[2]), inputAnimal[3]);
                    zebra.makeSound();
                    allAnimals.add(zebra);
                }
                case "tiger" -> {
                    Tiger tiger = new Tiger(inputAnimal[1], Double.parseDouble(inputAnimal[2]), inputAnimal[3]);
                    tiger.makeSound();
                    allAnimals.add(tiger);
                }
            }
            animalFood = scan.nextLine().toLowerCase().split(" ");
            switch (animalFood[0]) {
                case "vegetable" -> {
                    if (inputAnimal[0].equals("cat") || inputAnimal[0].equals("zebra") || inputAnimal[0].equals("mouse")) {
                        System.out.println(Arrays.toString(animalFood));
                    } else {
                        System.out.println(inputAnimal[0].substring(0, 1).toUpperCase() + inputAnimal[0].substring(1).toLowerCase() + "s are not eating that type of food!");
                    }
                }
                case "meat" -> {
                    if (inputAnimal[0].equals("cat") || inputAnimal[0].equals("tiger")) {

                        System.out.println(Arrays.toString(animalFood));
                    } else {
                        System.out.println(inputAnimal[0].substring(0, 1).toUpperCase() + inputAnimal[0].substring(1).toLowerCase() + "s are not eating that type of food!");
                    }
                }
            }
        }
        System.out.println("End");
        System.out.println(allAnimals);
    }
}