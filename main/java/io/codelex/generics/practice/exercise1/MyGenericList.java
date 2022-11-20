package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class MyGenericList<T> {

    private List<T> elements = new ArrayList<>();

    public void add(int i, T el) {
        elements.add(i, el);
    }

    public T get(int i) {
        return elements.get(i);
    }
}
