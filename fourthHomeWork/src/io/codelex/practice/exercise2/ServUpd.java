package io.codelex.practice.exercise2;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ServUpd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date when server was launched (yyyy-MM-dd):");
        String firstDate = input.nextLine();
        System.out.println("Enter (yyyy-MM) to see days when server updates are due:");
        String secondDate = input.nextLine();
        LocalDate start = LocalDate.parse(firstDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        LocalDate end = YearMonth.parse(secondDate, formatter).atEndOfMonth();

//        Stream.iterate(start, date -> date.plusWeeks(2))
//                .limit(WEEKS.between(start, end))
//                .forEach(System.out::println);
    }
}
