package io.codelex.classesandobjects.practice;

import java.awt.*;
import java.util.Scanner;

public class swapPoints {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first point cocrdinates (x and y): ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.println("Enter second point cocrdinates (x and y): ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        p1.x ^= p2.x;
        p2.x ^= p1.x;
        p1.x ^= p2.x;

        p1.y ^= p2.y;
        p2.y ^= p1.y;
        p1.y ^= p2.y;

        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }
}
