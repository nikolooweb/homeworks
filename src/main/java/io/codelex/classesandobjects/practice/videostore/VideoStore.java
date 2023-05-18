package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    List<Video> videos = new ArrayList<>();

    public void addVideo(String title) {
        videos.add(new Video(title));
    }

    public void checkOutVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                video.setCheckedOut();
                return;
            }
        }
    }

    public void returnVideo(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                video.setReturned();
                return;
            }
        }
    }

    public void setRatingByVideoTitle(String title, int rating) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                video.setRating(rating);
                return;
            }
        }
    }

    public void listInventoryOfVideos() {
        for (Video video : videos) {
            System.out.println(video);
        }
    }
}


