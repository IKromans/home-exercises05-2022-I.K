package io.codelex.combinerGenerics.java_advanced_test;

import io.codelex.combinerGenerics.Combiner;
import io.codelex.java_advanced_test.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    void testTwoTimes() {
        Joiner<Integer> joiner = new Joiner<>(1, "-", a -> a.toString() + "-" + (a + a));
        String result = joiner.join(1);
        Assertions.assertEquals("1-2", result);
    }
}
