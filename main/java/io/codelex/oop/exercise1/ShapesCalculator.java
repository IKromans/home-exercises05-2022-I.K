package io.codelex.oop.exercise1;

public class ShapesCalculator {
    public static void main(String[] args) {

        Rectangle one = new Rectangle(4, 5, 6);
        System.out.println(one.getArea());
        System.out.println(one.getPerimeter());

        Triangle two = new Triangle(3, 4, 4);
        System.out.println(two.getArea());
        System.out.println(two.getPerimeter());
    }
}
