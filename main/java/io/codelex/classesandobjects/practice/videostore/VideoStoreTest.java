package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

import static io.codelex.classesandobjects.practice.videostore.VideoStore.*;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to see movies available");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    returnInventory(keyboard);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String title = scanner.next();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            boolean isCheckedOut = false;
            Video movieName = new Video(title, isCheckedOut, rating);
            addNewVideo(movieName);
            System.out.println(movieName);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie you want to rent: ");
        String movieName = scanner.next();
        checkOutVideo(movieName);
        System.out.println(movieList.toString());
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie you want to return: ");
        String movieName = scanner.next();
        returnVideoToStore(movieName);
        System.out.println("Enter movies rating: ");
        int rating = scanner.nextInt();
        setUserRating(movieName, rating);
    }

    public static void returnInventory(Scanner scanner) {
        System.out.println(movieList.toString());
    }
}
