package io.codelex.classesandobjects.practice;

public class MovieApp {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Production", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbian Pictures");
        Movie movie4 = new Movie("x-man", "super shoot");
        Movie movie5 = new Movie("hole in the wall", "bollywood images", "PG");

        Movie[] moviesThatHasPG = Movie.getPG(new Movie[]{movie1, movie2, movie3, movie4, movie5});

        for (Movie hasPG : moviesThatHasPG) {
            if (hasPG == null) {
                continue;
            }
            System.out.println(hasPG.getTitle() + " has rating " + hasPG.getRating());
        }
    }
}
