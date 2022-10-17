package io.codelex.generics.practice.exercise1;

public class MyLongList extends MyList {

    public void add(int i, Long el) {
        super.add(i, el);
    }

    public Long get(int i) {
        return (Long) super.get(i);
    }

}
