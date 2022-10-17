package io.codelex.generics.practice.exercise1;

public class MyGenericApp {
    public static void main(String[] args) {

        MyGenericList<String> first = new MyGenericList<>();
        first.add(0, "word");
        System.out.println(first.get(0));
    }
}
