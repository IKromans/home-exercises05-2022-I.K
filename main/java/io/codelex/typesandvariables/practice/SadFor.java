package io.codelex.typesandvariables.practice;

import io.codelex.NoCodeWrittenException;

public class SadFor {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {

        for (int i = 0; i < 10; i++) {
            if (Math.sqrt(i) > 2.5) {
                break;
            }
            System.out.println(i + ", ");
        }
        System.out.println("end");
    }
}
