package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkingDays {

    public static void main(String[] args) {

        int workingHours = 0;

        Scanner in = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.println("Type date1 in format (yyyy/MM/dd) :   ");
        LocalDate date1 = LocalDate.parse(in.next(), dateFormat);

        System.out.println("Type date2 in format (yyyy/MM/dd) :   ");
        LocalDate date2 = LocalDate.parse(in.next(), dateFormat);

        for (LocalDate startDate = date1; !(startDate.isAfter(date2)); startDate = startDate.plusDays(1)) {
            int currentDate = startDate.getDayOfWeek().getValue();
            if (currentDate >= DayOfWeek.MONDAY.getValue() && currentDate <= DayOfWeek.FRIDAY.getValue()) {
                workingHours += 8;
            }
        }
        System.out.println(workingHours);

    }
}
