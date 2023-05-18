package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args) {

        Date date1 = new Date(12, 23, 2023);
        System.out.println("initial date ----> " + date1.displayDate());

        date1.setYear(2024);
        date1.setDay(1);
        date1.setMonth(1);

        System.out.println("updated date ----> " + date1.displayDate());
    }
}
