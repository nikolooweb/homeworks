package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {

    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod second) {
        if (this.end.isBefore(second.start) || this.start.isAfter(second.end)) {
            return null;
        } else if (intersectionTest1(second)) {
            return new DatePeriod(second.start, second.end);
        } else if (intersectionTest2(second)) {
            return new DatePeriod(this.start, this.end);
        } else if (intersectionTest3(second)) {
            return new DatePeriod(second.start, this.end);
        } else if (intersectionTest4(second)) {
            return new DatePeriod(this.start, second.end);
        } else if (intersectionTest5(second)) {
            return new DatePeriod(this.start, second.end);
        } else if (intersectionTest6(second)) {
            return new DatePeriod(this.start, this.end);
        } else if (intersectionTest7(second)) {
            return new DatePeriod(second.start, this.end);
        } else if (intersectionTest8(second)) {
            return new DatePeriod(this.start, this.end);
        } else if (intersectionTest9(second)) {
            return new DatePeriod(this.start, this.end);
        }
        return null;
    }

    private boolean intersectionTest1(DatePeriod second) {
        return this.start.isBefore(second.start) && this.end.isAfter(second.end);
    }

    private boolean intersectionTest2(DatePeriod second) {
        return this.start.isAfter(second.start) && this.end.isBefore(second.end);
    }

    private boolean intersectionTest3(DatePeriod second) {
        return this.start.isBefore(second.start) && this.end.isBefore(second.end);
    }

    private boolean intersectionTest4(DatePeriod second) {
        return this.start.isAfter(second.start) && this.end.isAfter(second.end);
    }

    private boolean intersectionTest5(DatePeriod second) {
        return this.start.isEqual(second.start) && this.end.isAfter(second.end);
    }

    private boolean intersectionTest6(DatePeriod second) {
        return this.start.isEqual(second.start) && this.end.isBefore(second.end);
    }

    private boolean intersectionTest7(DatePeriod second) {
        return this.start.isBefore(second.start) && this.end.isEqual(second.end);
    }

    private boolean intersectionTest8(DatePeriod second) {
        return this.start.isAfter(second.start) && this.end.isEqual(second.end);
    }

    private boolean intersectionTest9(DatePeriod second) {
        return this.start.isEqual(second.start) && this.end.isEqual(second.end);
    }

    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 17);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 8);
        LocalDate secondEnd = LocalDate.of(2022, 1, 17);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        System.out.println(overlap.start);
        System.out.println(overlap.end);
    }


}
