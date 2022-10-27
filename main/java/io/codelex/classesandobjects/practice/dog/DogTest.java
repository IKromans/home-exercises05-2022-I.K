package io.codelex.classesandobjects.practice.dog;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Lady", "Rocky", "Max", "male");
        Dog rocky = new Dog("Molly", "Sam", "Rocky", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Lady", "Sparky", "Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Molly", "Buster", "Coco", "female");

        coco.fathersName();
        sparky.fathersName();
        coco.hasSameMotherAs(rocky);
    }
}
