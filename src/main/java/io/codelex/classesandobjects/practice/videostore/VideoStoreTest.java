package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static final VideoStore store1 = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in).useDelimiter("\r?\n");

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to see inventory of videos (as user)");

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
                    store1.listInventoryOfVideos();
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {

            System.out.println("Enter movie name: ");
            String movieName = scanner.next();

            System.out.println("Enter rating: ");
            int rating = scanner.nextInt();

            store1.addVideo(movieName);
            store1.setRatingByVideoTitle(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        store1.listInventoryOfVideos();
        System.out.println("================================================");
        System.out.println("Which video do you want to rent out, type title: ");
        String movieName = scanner.next();
        store1.checkOutVideo(movieName);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("================================================");
        System.out.println("Which video do you want to return, type title: ");
        String movieName = scanner.next();
        store1.returnVideo(movieName);
    }
}
