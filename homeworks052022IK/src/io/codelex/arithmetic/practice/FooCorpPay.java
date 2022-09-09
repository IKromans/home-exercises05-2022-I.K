package io.codelex.arithmetic.practice;

import java.util.Scanner;

import static io.codelex.arithmetic.practice.CalculateArea.getMenu;

public class FooCorpPay {
    static double hourPay = 8;
    static double maxHours = 60;
    static double basePay = 0;
    static double hoursWorked = 0;

    public static void main(String[] args) throws Exception {

        int choice;
        do {
            // Get the user's menu choice.
            choice = getMenu();

            if (choice == 1) {
                Scanner input = new Scanner(System.in);
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Employee Nr. " + i);
                    System.out.print("Please enter Base Pay: ");
                    basePay = input.nextDouble();

                    System.out.print("Please enter Hours Worked: ");
                    hoursWorked = input.nextDouble();

                    calculateSalary();
                }
            } else if (choice == 2) {
                System.out.println("Thanks for calculating!");
            }

        } while (choice != 2);
    }

    public static int getMenu() {
        int userChoice;

        // keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display the menu.
        System.out.println("Salary Calculator\n");
        System.out.println("1. Calculate the salary of employee");
        System.out.println("2. Quit\n");
        System.out.print("Enter your choice (1-2) : ");

        // get input from user
        userChoice = keyboard.nextInt();

        // validate input
        while (userChoice < 1 || userChoice > 2) {
            System.out.print("Please enter a valid range: 1 or 2: ");
            userChoice = keyboard.nextInt();
        }

        return userChoice;
    }

    public static void calculateSalary() throws Exception {
        double salary = 0;
        if ((basePay < hourPay) || hoursWorked > maxHours) {
            System.out.println("Error!!!");
            ;
        } else if (hoursWorked > 40) {
            salary = basePay * 40 + basePay * 1.5 * (hoursWorked - 40);
            System.out.println("Salary is: " + salary);
        } else {
            salary = basePay * hoursWorked;
            System.out.println("Salary is: " + salary);
        }
    }
}
