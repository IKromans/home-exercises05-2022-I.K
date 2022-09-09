package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int sum = 0;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }

        double average = (double) sum / upperBound;
        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + sum);
        System.out.println("The average is " + average);
    }
}
