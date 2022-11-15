package io.codelex.practice.exercise3;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;


    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        DatePeriod firstPeriod = new DatePeriod(this.start, this.end);
        if (!isOverlapping(firstPeriod, secondPeriod)) {
            System.out.println(10);
            return null;
        } else {
            System.out.println(secondPeriod.start);
            System.out.println(firstPeriod.end);
            return new DatePeriod(firstPeriod.end, secondPeriod.start);
        }
    }

    private static boolean isOverlapping(DatePeriod firstPeriod, DatePeriod secondPeriod) {
        return firstPeriod.start.isBefore(secondPeriod.end) && firstPeriod.end.isAfter(secondPeriod.start)
                || firstPeriod.start.isBefore(secondPeriod.start) && firstPeriod.end.isAfter(secondPeriod.end)
                || secondPeriod.start.isBefore(firstPeriod.start) && secondPeriod.end.isAfter(firstPeriod.end)
                || secondPeriod.start.isBefore(firstPeriod.end) && firstPeriod.start.isBefore(secondPeriod.start);
    }
}
