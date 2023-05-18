package io.codelex.classesandobjects.practice;

public class Movie {
    private String title;
    private String studio;
    private String rating;

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

    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Production", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbian Pictures");
        Movie movie4 = new Movie("x-man", "super shoot");
        Movie movie5 = new Movie("hole in the wall", "bollywood images", "PG");

        Movie[] moviesThatHasPG = getPG(new Movie[]{movie1, movie2, movie3, movie4, movie5});

        for (Movie hasPG : moviesThatHasPG) {
            if (hasPG == null) {
                continue;
            }
            System.out.println(hasPG.title + " has rating " + hasPG.rating);
        }
    }


    public static Movie[] getPG(Movie[] movies) {

        Movie[] havePGMovies = new Movie[movies.length];
        int index = 0;

        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                havePGMovies[index] = movie;
                index++;
            }
        }
        return havePGMovies;
    }
}
