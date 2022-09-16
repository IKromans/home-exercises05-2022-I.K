package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {


        while (true){
            Scanner numberScanner = new Scanner(System.in);
            System.out.print("Please enter number: ");
            int i = numberScanner.nextInt();

            if (i % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            System.out.println("bye!");
        }
    }
}
