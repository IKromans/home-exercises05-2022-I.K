package io.codelex.practice.exercise3;

import java.time.LocalDate;

public class DatePeriodApp {
    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter start date 1 (yyyy-MM-dd):");
//        String startA = input.nextLine();
//        System.out.println("Enter end date 1 (yyyy-MM-dd) :");
//        String endA = input.nextLine();
//
//        LocalDate ab = LocalDate.parse(startA);
//        LocalDate ba = LocalDate.parse(endA);
//
//        System.out.println("Enter start date 2 (yyyy-MM-dd):");
//        String startB = input.nextLine();
//        System.out.println("Enter end date 2 (yyyy-MM-dd) :");
//        String endB = input.nextLine();
//
//        LocalDate xy = LocalDate.parse(startB);
//        LocalDate yx = LocalDate.parse(endB);



//        LocalDate start = LocalDate.parse(startDate);
//        LocalDate end = LocalDate.parse(endDate);

    }

}
