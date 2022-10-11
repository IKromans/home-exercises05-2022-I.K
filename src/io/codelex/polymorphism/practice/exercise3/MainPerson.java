package io.codelex.polymorphism.practice.exercise3;

public class MainPerson {

    public static void main(String[] args) {

        Student student = new Student(4.5);
        student.setFirstName("Bart");
        student.setLastName("Simpson");
        student.setAddress("Springfield");
        student.setId(2);

        Employee employee = new Employee("Bartender");
        employee.setFirstName("Mo");
        employee.setLastName("Sizlak");
        employee.setAddress("Springfield");
        employee.setId(14);

        employee.display();
        student.display();


    }
}
