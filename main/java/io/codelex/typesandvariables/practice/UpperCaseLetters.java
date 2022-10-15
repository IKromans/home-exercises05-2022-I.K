package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class UpperCaseLetters {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        System.out.println("Please, enter some text and I'll count number of the uppercase letters in it.");
        String enteredText = text.nextLine();
        int upperCaseLetters = 0;
        for (int i = 0; i < enteredText.length(); i++) {
            char ch = enteredText.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upperCaseLetters++;
        }
        if (upperCaseLetters == 0) {
            System.out.println("There was 0 upper case letters.");
        } else if (upperCaseLetters == 1) {
            System.out.println("There was only 1 upper case letter.");
        } else {
            System.out.println("I managed to count " + upperCaseLetters + " upper case letters.");
        }
    }
}
