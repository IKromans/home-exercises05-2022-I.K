package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        System.out.print("Please enter some text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase().replaceAll("[^a-zA-Z ]", "");

        if (text.length() == 0) {
            System.out.println("Try again!");
        } else {
            for (int i = 0; i < text.length(); i++) {
                switch (text.charAt(i)) {
                    case ' ' -> System.out.print(" ");
                    case 'a', 'b', 'c' -> System.out.print(2);
                    case 'd', 'e', 'f' -> System.out.print(3);
                    case 'g', 'h', 'i' -> System.out.print(4);
                    case 'j', 'k', 'l' -> System.out.print(5);
                    case 'm', 'n', 'o' -> System.out.print(6);
                    case 'p', 'q', 'r', 's' -> System.out.print(7);
                    case 't', 'u', 'v' -> System.out.print(8);
                    case 'w', 'x', 'y', 'z' -> System.out.print(9);
                }
            }
        }
    }
}
