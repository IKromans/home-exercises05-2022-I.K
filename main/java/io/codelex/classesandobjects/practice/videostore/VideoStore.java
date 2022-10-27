package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    static ArrayList<Video> movieList = new ArrayList<>();

    public static void addNewVideo(Video movieName) {
        movieList.add(movieName);
    }

    public static void checkOutVideo(String title) {
        for (Video movieName : movieList) {
            if (movieName.getTitle().contains(title)) {
                movieName.setCheckedOut(true);
            }
        }
    }

    public static void returnVideoToStore(String title) {
        for (Video movieName : movieList) {
            if (movieName.getTitle().contains(title)) {
                movieName.setCheckedOut(false);
            }
        }
    }

    public static void setUserRating(String title, int rating) {
        for (Video movieName : movieList) {
            if (movieName.getTitle().contains(title)) {
                movieName.setRating(rating);
            }
        }
    }

    public static void listInventory() {
        System.out.println(movieList.toString());
    }
}
