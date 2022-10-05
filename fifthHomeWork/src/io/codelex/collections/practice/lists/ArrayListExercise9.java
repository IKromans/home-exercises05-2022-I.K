package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListExercise9 {

    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>();
        firstList.add("Red");
        firstList.add("Green");
        firstList.add("Black");
        firstList.add("White");
        firstList.add("Pink");
        System.out.println("List of first array: " + firstList);

        List<String> secondList = new ArrayList<>();
        secondList.add("Red");
        secondList.add("Green");
        secondList.add("Black");
        secondList.add("Pink");
        System.out.println("List of second array: " + secondList);

        //TODO: Write a Java program to join two array lists.
        List<String> joinedList = Stream.concat(firstList.stream(), secondList.stream()).toList();
        System.out.println("Joined list: " + joinedList);
    }
}
