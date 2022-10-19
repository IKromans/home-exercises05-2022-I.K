package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Program calculates and displays person's body mass index!");
        System.out.print("Please enter your weight in kg: ");
        double weight = number.nextDouble();
        System.out.print("Please enter your height in m: ");
        double height = number.nextDouble();

        double weightInPounds = weight * 2.2;
        double heightInInches = height * 39.37;
        double BodyMassIndex = weightInPounds * 703 / Math.pow(heightInInches, 2);

        if (BodyMassIndex < 18.5) {
            System.out.printf("You are underweight, BMI is: %.2f", BodyMassIndex);
        } else if (BodyMassIndex > 25) {
            System.out.printf("You are overweight, BMI is: %.2f", BodyMassIndex);
        } else {
            System.out.printf("Your BMI is %.2f it is optimal.", BodyMassIndex);
        }
    }
}
