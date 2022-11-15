package io.codelex.oop.exercise6;

public class ParcelTest {
    public static void main(String[] args) {

        Parcel book = new Parcel(31, 40, 15, 12.3f);
        System.out.println(book.validate());
        Parcel drone = new Parcel(35, 40, 70, 28.7f);
        System.out.println(drone.validate());
        Parcel pillow = new Parcel(40, 60, 80, 8.4f);
        System.out.println(pillow.validate());

    }
}
