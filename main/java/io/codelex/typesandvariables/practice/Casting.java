package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        String a = "1";
        Integer b = 2;
        int c = 3;
        double d = 4;
        float e = 5;

        int z = Integer.parseInt(a);
        int y = (int)d;
        int f = (int)e;

        //fixme - should be 15 :|
        int sum = z + b + c + y + f;
        System.out.println(sum);
    }

    private static void second() {
        String a = "1";
        Integer b = 2;
        int c = 3;
        double d = 4.2;
        float e = 5.3f;

        float z = Float.parseFloat(a);
        float y = (float)d;


        //fixme - should be 15.5 :|
        float sum = z + b + c + y + e;
        System.out.println(sum);
    }
}
