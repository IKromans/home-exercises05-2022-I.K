package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public abstract class MyList {

    private List<Object> elements = new ArrayList<>();

    public void add(int i, Object el) {
        elements.add(i, el);
    }

    public Object get(int i) {
        return elements.get(i);
    }
}
