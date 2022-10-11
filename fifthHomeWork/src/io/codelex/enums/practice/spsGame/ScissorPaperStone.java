package io.codelex.enums.practice.spsGame;

public enum ScissorPaperStone {

    SCISSORS('s'),
    PAPER('p'),
    STONE('t'),
    EXIT('q');

    private final char name;

    ScissorPaperStone(char name) {
        this.name = name;
    }

    public static ScissorPaperStone getSPSByInt(int value) {
        ScissorPaperStone[] allChoices = ScissorPaperStone.values();
        for (ScissorPaperStone choice : allChoices) {
            if (choice.ordinal() == value) {
                return choice;
            }
        }
        return ScissorPaperStone.SCISSORS;
    }

    public static ScissorPaperStone getSPSByChar(final char name) {
        for (ScissorPaperStone type : ScissorPaperStone.values())
            if (type.name == name)
                return type;

        return null;
    }
}
