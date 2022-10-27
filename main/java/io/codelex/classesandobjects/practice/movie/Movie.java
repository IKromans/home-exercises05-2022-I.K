package io.codelex.classesandobjects.practice.movie;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public Movie[] getPG(Movie[] moviesArr) {
        Movie[] movies = new Movie[moviesArr.length];
        int newArr = 0;
        for (int i = 0; i < moviesArr.length; i++) {
            if (moviesArr[i].rating.equals("PG")) {
                movies[newArr] = movies[i];
                System.out.println(movies[newArr].title + " " + movies[newArr].studio + " " + movies[newArr].rating);
            }
            newArr++;
        }
        return movies;
    }
}
