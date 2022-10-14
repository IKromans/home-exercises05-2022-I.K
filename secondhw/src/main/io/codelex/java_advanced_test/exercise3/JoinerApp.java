package io.codelex.java_advanced_test.exercise3;

public class JoinerApp {
    public static void main(String[] args) {

        Joiner<Integer> joiner = new Joiner<>(1, "-", a -> a.toString() + "-" + (a + a));

        System.out.println(joiner.join(1));
    }
}
