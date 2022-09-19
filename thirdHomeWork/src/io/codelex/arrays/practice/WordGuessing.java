package io.codelex.arrays.practice;

import java.util.Scanner;

public class WordGuessing {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Word Guessing Game!");
        Thread.sleep(1000);
        System.out.println("Generating random word, please wait...");
        Thread.sleep(2500);

        StringBuilder usedLetters = new StringBuilder("");

        String[] wordLibrary = new String[]{"programming", "java",
                "bag", "table", "letter", "spoon", "book", "physics",
                "aircraft", "webcam"};

//        get random word from wordLibrary
        String randomWord = wordLibrary[(int) (Math.random() * wordLibrary.length)];
        System.out.println("Word has " + randomWord.length() + " letters");
        char[] letters = new char[randomWord.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = '.';
        }

//        set player lives
        int lives = 5;
        Scanner input = new Scanner(System.in);

//        run game
        while (true) {
            System.out.print("You have " + lives + " lives left!");
            System.out.println();
            System.out.print("Input your guess: ");
            String keyboard = input.nextLine();
            char letter = keyboard.charAt(0);
//            players guessed letters
            usedLetters.append(letter);

            boolean isGuessCorrect = false;
            for (int i = 0; i < randomWord.length(); i++) {
                char x = randomWord.charAt(i);
                if (x == letter) {
                    letters[i] = x;
                    isGuessCorrect = true;
                }
            }
//            subtract lives if guess is wrong
            if (!isGuessCorrect) {
                lives--;
            }

//            check if word is guessed
            boolean isGameFinished = true;
            System.out.print("Word: ");
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == '.') {
                    isGameFinished = false;
                }
                System.out.print(letters[i]);
            }
            System.out.println();
            System.out.println("Your tries: " + usedLetters);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

//            game ends
            if (isGameFinished) {
                System.out.println("You won!!!");
                break;
            }
            if (lives == 0) {
                System.out.println("You lost! The word was: " + randomWord);
                break;
            }
        }
        System.out.println("Exiting game");
        Thread.sleep(1500);
    }
}
