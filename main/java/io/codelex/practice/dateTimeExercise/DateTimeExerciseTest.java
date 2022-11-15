package io.codelex.dateandtime.practice.dateTimeExercise;

import java.time.LocalDate;
import java.util.Arrays;

public class DateTimeExerciseTest {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(DateTimeExercise.getTwoLocalDates()));
        System.out.println(DateTimeExercise.createNewYearsEve2017());
        System.out.println(DateTimeExercise.findNextFriday13th(LocalDate.now()));
    }
}
