package io.codelex.classesandobjects.practice.dog;


public class Dog {
    private String mother;
    private String father;
    private String name;
    private String gender;

    public Dog(String mother, String father, String name, String gender) {
        this.mother = mother;
        this.father = father;
        this.name = name;
        this.gender = gender;
    }

    public Dog(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + gender + mother + father;
    }

    public String fathersName() {
        if (father == null) {
            System.out.println("Unknown!");
            return "Unknown!";
        } else {
            System.out.println(father);
            return father;
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (mother.equals(otherDog.mother)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
