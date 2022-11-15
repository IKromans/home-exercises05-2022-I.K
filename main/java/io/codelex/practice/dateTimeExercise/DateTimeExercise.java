package io.codelex.dateandtime.practice.dateTimeExercise;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
        boolean is13Friday = false;
        LocalDate nextFriday = from;
        while (!is13Friday) {
            nextFriday = getNextFriday(nextFriday);
            is13Friday = is13Friday(nextFriday);
        }
        return nextFriday;
    }

    public static LocalDate getNextFriday(LocalDate date) {
        return date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
    }

    public static boolean is13Friday(LocalDate date) {
        return date.getDayOfMonth() == 13;
    }
}
