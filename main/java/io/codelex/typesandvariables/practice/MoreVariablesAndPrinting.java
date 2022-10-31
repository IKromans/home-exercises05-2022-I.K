package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String name = "Zed A. Shaw";
        int age = 35;
        int height = 74;  // inches
        int weight = 180; // lbs
        double heightInCm = height * 2.54;
        double weightInKg = Math.round(weight * 0.453592 * 100.0) / 100.0;
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " inches tall, that's " + heightInCm + "cm.");
        System.out.println("He's " + weight + " pounds heavy, that's " + weightInKg + "kg.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + heightInCm + ", and " + weightInKg
                + " I get " + (age + heightInCm + weightInKg) + ".");
    }
}