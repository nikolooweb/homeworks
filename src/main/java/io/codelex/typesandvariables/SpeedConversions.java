package io.codelex.typesandvariables;

import java.util.Scanner;

public class SpeedConversions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter distance in meters: ");
        int distanceMeters = in.nextInt();
        System.out.println("Enter time(hours)");
        int hours = in.nextInt();
        System.out.println("Enter time(minutes)");
        int minutes = in.nextInt();
        System.out.println("Enter time(seconds)");
        int seconds = in.nextInt();
        System.out.printf("%d m | %d hr : %d min : %d sec%n", distanceMeters, hours, minutes, seconds);
        System.out.println("--------------------------------");

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double metersPerSecond = (double) distanceMeters / totalSeconds;

        System.out.println("Your speed in meters/second is " + metersPerSecond);
        System.out.println("Your speed in km/h is " + metersPerSecond * 3.6);
        System.out.println("Your speed in miles/h is " + metersPerSecond * 2.24);



    }

}
