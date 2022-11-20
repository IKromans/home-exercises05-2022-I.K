package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class ThirdExercise {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Object> listX = new ArrayList<>();
        List<Object> listY = new ArrayList<>();

        add(9, list);
        add("ok", list);
        add('r', list);

        list1.add("all");
        list1.add("string");
        list1.add("list");

        list2.add(4);
        list2.add(7);
        list2.add(2);

        addAllX(list, listX);
        addAllX(list2, listX);
        addAllX(list, listX);
        System.out.println(listX);

//        addAllY(list1, listY);
//        addAllY(list2, listY);
        addAllY(list, listY);
        System.out.println(listY);
    }

    public static void add(Object value, List<Object> list) {
        list.add(value);
    }
    public static <V> void addAllX(List<V> v, List<? super V> l) {
        l.addAll(v);
    }
    public static <V> void addAllY(List<V> v, List<V> l) {
        l.addAll(v);
    }
}
