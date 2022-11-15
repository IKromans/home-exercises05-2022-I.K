package io.codelex.oop.exercise4;

public enum Runner {
    BEGINNER(50, 120),
    INTERMEDIATE(30, 50),
    ADVANCED(1, 30);

    private final int minStart;
    private final int minEnd;

    Runner(int minStart, int minEnd) {
        this.minStart = minStart;
        this.minEnd = minEnd;
    }

    static void getFitnessLevel(int time) {
        if (time < ADVANCED.minEnd) {
            System.out.println(ADVANCED);
        } else if (time > BEGINNER.minStart) {
            System.out.println(BEGINNER);
        } else if (time > INTERMEDIATE.minStart && time < INTERMEDIATE.minEnd) {
            System.out.println(INTERMEDIATE);

        }
    }
}
