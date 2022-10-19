package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {

        int start = 1;
        int end = 10;
        int product = 1;

        for (int number = start; number <= end; number++) {
            product *= number;
        }
        System.out.println(product);
    }
}
