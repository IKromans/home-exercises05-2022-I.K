package io.codelex.java_advanced_test.exercise3;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.stream.Stream;

public class Joiner<T> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    @SafeVarargs
    public final String join(T... args) {
        return Stream.of(args).map(T::toString).reduce((a, b) -> a + separator + b).get();
    }
}
