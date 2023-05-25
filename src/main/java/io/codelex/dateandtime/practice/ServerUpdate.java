package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class ServerUpdate {
    public static void main(String[] args) {
        LocalDate launchDate = LocalDate.of(2022, 2, 2);
        int year = 2022;
        String month = "september";

        for (LocalDate startDate = launchDate; monthEquals(startDate, month, year); startDate = startDate.plusDays(14)) {
            if (launchDate.equals(startDate)) continue;
            System.out.println("Update date: " + "| " + startDate.getYear() + " | " + startDate.getDayOfMonth() + " of " + startDate.getMonth() + " |");
        }
    }

    public static boolean monthEquals(LocalDate startDate, String month, int year) {
        if (startDate.getYear() <= year) {
            return startDate.isBefore(LocalDate.of(year, Month.valueOf(month.toUpperCase()).plus(1).getValue(), 1));
        }
        return false;
    }
}

