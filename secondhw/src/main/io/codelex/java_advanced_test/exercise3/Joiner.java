package io.codelex.java_advanced_test.exercise3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Joiner<T> {

    private T value;

    private String separator;

    private Function<T, String> joiner;

    public Joiner(T value, String separator, Function<T, String> joiner) {
        this.value = value;
        this.separator = separator;
        this.joiner = joiner;
    }

    public String join(T value){
        return joiner.apply(value);
    }

}
