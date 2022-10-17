package io.codelex.combinerGenerics.java_advanced_test;

import io.codelex.java_advanced_test.exercise3.Joiner;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class JoinerTest {

    @Test
    void testInteger() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String result = joiner.join(1, 2);
        Assertions.assertEquals("1-2", result);
    }

    @Test
    void testCharacter() {
        Joiner<Character> joiner = new Joiner<>(" + ");
        String result = joiner.join('a', 'b');
        Assertions.assertEquals("a + b", result);
    }
}
