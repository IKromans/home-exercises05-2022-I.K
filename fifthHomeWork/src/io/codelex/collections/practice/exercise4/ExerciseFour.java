package io.codelex.collections.practice.exercise4;

import java.util.*;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        System.out.print("Enter name: ");

        while (true) {
            String line = input.nextLine();
            if (line.isEmpty()) {
                break;
            }
            System.out.print("Enter name: ");
            names.add(line);
        }
        System.out.print("Unique name list contains: ");
        for (String element : names) {
            System.out.print(element + " ");
        }
    }
}
