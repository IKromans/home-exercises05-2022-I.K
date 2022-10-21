package io.codelex.collections.practice.phonebook;

import java.util.Scanner;

public class PhoneDirectoryTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PhoneDirectoryTreeMap directory = new PhoneDirectoryTreeMap();
        System.out.println("Phone Directory Test");

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("for new entry press 1");
            System.out.println("to find number press 2");
            System.out.println("to exit press *");

            String name;
            String number;
            String n = input.nextLine();
            switch (n) {
                case "1":
                    System.out.println("enter name:");
                    name = input.nextLine();
                    System.out.println("enter number:");
                    number = input.nextLine();
                    directory.putNumber(name, number);
                    System.out.println("number stored successfully!");
                    break;
                case "2":
                    System.out.println("enter name to find number:");
                    name = input.nextLine();
                    System.out.println("your requested name number is " + directory.getNumber(name));
                    break;
                case "*":
                    System.out.println("bye!");
                    System.exit(0);

            }
        }
    }
}
