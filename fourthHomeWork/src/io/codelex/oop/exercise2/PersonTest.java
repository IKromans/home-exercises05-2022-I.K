package io.codelex.oop.exercise2;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {

        Employee one = new Employee("John", "Brown", "JB123", 23, "Accountat", LocalDate.of(2020, 9, 10));
        Customer two = new Customer("Peter", "Brown", "PB321", 45, "007", 67);

        two.setPurchaseCount(68);
        System.out.println(one.getInfo());
        System.out.println(two.getInfo());

    }
}
