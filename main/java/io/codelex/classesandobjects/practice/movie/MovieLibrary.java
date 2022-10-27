package io.codelex.classesandobjects.practice.movie;

public class MovieLibrary {
    public static void main(String[] args) {
        Movie movies1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movies2 = new Movie("Glass", "Buena Vista International", "PG-13");
        Movie movies3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");
        Movie[] movies = {movies1, movies2, movies3};

//              kaut kur neiebraucu kā te viss strādā
        movies1.getPG(movies);
    }
}
