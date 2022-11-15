package io.codelex.oop.exercise9;

public class ShapeTest {
    public static void main(String[] args) {

        Rectangle one = new Rectangle(5, 10);
        Triangle two = new Triangle(13);
        Hexagon three = new Hexagon(4);
        Cone four = new Cone(9, 2);
        Qube five = new Qube(20);

        System.out.println(one.calculateArea());
        System.out.println(one.calculatePerimeter());
        System.out.println(two.calculateArea());
        System.out.println(two.calculatePerimeter());
        System.out.println(three.calculateArea());
        System.out.println(three.calculatePerimeter());
        System.out.println(four.calculateVolume());
        System.out.println(five.calculateVolume());
        System.out.println(five.calculatePerimeter());

    }
}
