package io.codelex.generics.practice.exercise1;

public class MyStringList extends MyList {

    public void add(int i, String el) {
        super.add(i, el);
    }

    public String get(int i) {
        return (String) super.get(i);
    }

}
