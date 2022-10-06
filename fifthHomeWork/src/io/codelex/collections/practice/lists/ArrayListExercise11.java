package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> elements = new ArrayList<>();

        //TODO: Add 10 values to list
        elements.add("Book");
        elements.add("Pen");
        elements.add("Pencil");
        elements.add("Tyre");
        elements.add("Phone");
        elements.add("Mouse");
        elements.add("Scissors");
        elements.add("Cash");
        elements.add("Bed");
        elements.add("Chair");

        //TODO: Add new value at 5th position
        elements.add(4, "Cabel");

        //TODO: Change value at last position (Calculate last position programmatically)
        elements.set(elements.size() - 1, "Paper");

        //TODO: Sort your list in alphabetical order
        Collections.sort(elements);

        //TODO: Check if your list contains "Foobar" element
        if (elements.contains("Foobar")) {
            System.out.println("List contains \"Foobar\".");
        } else {
            System.out.println("There is no \"Foobar\" in this list.");
        }

        //TODO: Print each element of list using loop
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
