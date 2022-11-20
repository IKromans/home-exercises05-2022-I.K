package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {

        List<String> word = new ArrayList<>();
        word.add("word");
        System.out.println(concatenate(word));

        List<Integer> one = new ArrayList<>();
        one.add(1);
        System.out.println(concatenate(one));

        List<Object> objectList = new ArrayList<>();
        objectList.add(new Object());
        System.out.println(concatenate(objectList));
    }

    public static String concatenate(List<?> list) {
        StringBuilder result = new StringBuilder();
        String separator = "";
        if (list.get(0) instanceof String) {
            result = new StringBuilder("String: ");
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = new StringBuilder("Integers: ");
            separator = "+";
        } else if (list.get(0) != null) {
            result = new StringBuilder("Object list: ");
            separator = "+";
        }
        for (Object el : list) {
            if (list.size() == 1) {
                result.append(el.toString());
            } else {
                result.append(el).append(separator);
            }
        }
        return result.toString();
    }
}
