package io.codelex.java_advanced_test.exercise1;

import java.math.BigDecimal;

public abstract class Card {

    protected BigDecimal balance;

    public Card(BigDecimal balance) {
        this.balance = balance;
    }
}
