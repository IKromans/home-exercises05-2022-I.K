package io.codelex.exceptions.practice.exercise2;

public class Exercise2 {
    private int number;

    public Exercise2(int a) {
        this.number = a;
    }

    public void methodA() throws ArithmeticException {
        methodB();
    }

    public void methodB() throws ArithmeticException {
        methodC();
    }

    public void methodC() throws ArithmeticException {
        System.out.println(number / 0);
    }
}
