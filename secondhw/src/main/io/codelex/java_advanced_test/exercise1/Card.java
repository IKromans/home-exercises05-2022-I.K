package io.codelex.java_advanced_test.exercise1;

public abstract class Card {

    private final String number;
    private final String name;
    private final String code;

    public Card(String number, String name, String code) {
        this.number = number;
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
