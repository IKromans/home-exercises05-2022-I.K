package io.codelex.generics.practice.exercise1;

public class MyApp {
    public static void main(String[] args) {

        MyStringList first = new MyStringList();
        first.add(0, "234");
        System.out.println(first.get(0));

        MyLongList first1 = new MyLongList();
        first1.add(0, 13243564L);
        System.out.println(first1.get(0));

    }
}
