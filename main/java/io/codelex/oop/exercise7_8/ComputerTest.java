package io.codelex.oop.exercise7_8;

public class ComputerTest {
    public static void main(String[] args) {
        Computer first = new Computer(1.5, 4, "Integrated", "HP", "01");
        Computer second = new Computer(3.5, 16, "RTX 3090 Ti", "VENGEANCE", "a7200");
        Laptop third = new Laptop(3.4, 8, "Intel UHD Graphics", "ASUS", "VivoBook 15", 3727);
        first.setGraphicsCard("External");
        second.setRam(32);
        System.out.println(first.getRam());
        System.out.println(first.toString());
        System.out.println(second.getRam());
        System.out.println(second.toString());
        System.out.println(third.getBattery());
        System.out.println(third.toString());
    }
}
