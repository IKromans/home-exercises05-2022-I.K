package io.codelex.exceptions.practice.exercise4;

import org.jetbrains.annotations.NotNull;

public class Exercise4 {
    public static void main(String @NotNull [] args) {
        try {
            double d = getInput(args[0]);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be imaginary number.");
        }
    }

    static double getInput(String s) throws NonPositiveNumberException {
        double d = new Double(s).doubleValue();
        if (d < 0) {
            throw new NonPositiveNumberException();
        }
        return d;
    }
}