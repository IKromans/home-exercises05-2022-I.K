package io.codelex.java_advanced_test.exercise3;

public class JoinerApp {
    public static void main(String[] args) {

        Joiner<Integer> joiner = new Joiner<>("-");
        Joiner<Character> joiner1 = new Joiner<>("+");

        System.out.println(joiner.join(1, 2, 3, 4, 5, 6));
        System.out.println(joiner1.join('a', 't', 'g', 'b', 'w'));
    }
}
