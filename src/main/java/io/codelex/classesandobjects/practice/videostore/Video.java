package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private final String title;
    private boolean isAvailable;
    private double averageUserRating;

    private int totalRating = 0;
    private int ratingCall = 0;

    public Video(String title) {
        this.title = title;
        isAvailable = true;
        averageUserRating = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setCheckedOut() {
        isAvailable = false;
    }

    public void setReturned() {
        isAvailable = true;
    }

    public void setRating(int rating) {
        ratingCall += 1;
        totalRating += rating;
        averageUserRating = (double) totalRating / ratingCall;
    }

    @Override
    public String toString() {
        return String.format("| Video title: %s, isAvailable: %b, Average rating: %.2f |", title, isAvailable, averageUserRating);
    }
}
