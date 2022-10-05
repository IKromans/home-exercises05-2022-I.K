package io.codelex.enums.practice.cardinalPoints;

public enum CardinalPoints {

    NORTH("North", "up"),
    SOUTH("South", "down"),
    EAST("East", "right"),
    WEST("West", "left");

    private final String name;
    private final String direction;

    CardinalPoints(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return name + ":" + direction + ":" + String.valueOf(ordinal());
    }
}
