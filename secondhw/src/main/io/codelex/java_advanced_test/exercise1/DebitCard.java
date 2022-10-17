package io.codelex.java_advanced_test.exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    private final String number;
    private final String name;
    private final String code;


    public DebitCard(BigDecimal balance, String number, String name, String code) {
        super(balance);
        this.number = number;
        this.name = name;
        this.code = code;
    }

    public void getBalance() {
        System.out.println(this.balance);
    }

    public void deposit(BigDecimal amount) {
        try {
            if (balance.add(amount).compareTo(BigDecimal.valueOf(10000)) >= 0) {
                throw new TooMuchFundsException("Balance cant be more than $10000.00");
            } else {
                balance = balance.add(new BigDecimal(String.valueOf(amount)));
            }
        } catch (TooMuchFundsException e) {
            System.out.println("Warning: Too much money");
        }
    }

    public void withdrawal(BigDecimal amount) {
        try {
            if (balance.subtract(amount).compareTo(BigDecimal.valueOf(0)) < 0) {
                throw new NotEnoughFundsException("Balance cant be below $0");
            } else {
                balance = balance.subtract(amount);
            }
        } catch (NotEnoughFundsException e) {
            System.out.println("Warning: Low funds");
        }
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", balance=" + balance +
                "} ";
    }
}
