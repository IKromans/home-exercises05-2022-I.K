package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person {

    private String jobTitle;

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void display() {
        System.out.println(getJobTitle() + " " + super.toString());
    }
}
