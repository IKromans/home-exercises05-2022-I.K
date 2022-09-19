package io.codelex.arrays.practice;

import java.util.stream.IntStream;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        int numbersSum = IntStream.of(numbers).sum();
        System.out.println("Sum of all array elements is " + numbersSum);

        int numbersAverage = numbersSum / numbers.length;
        System.out.println("Average number is " + numbersAverage);
    }
}
