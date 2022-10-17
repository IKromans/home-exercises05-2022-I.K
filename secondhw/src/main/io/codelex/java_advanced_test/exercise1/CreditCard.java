package io.codelex.java_advanced_test.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    private final String number;
    private final String name;
    private final String code;


    public CreditCard(BigDecimal balance, String number, String name, String code) {
        super(balance);
        this.number = number;
        this.name = name;
        this.code = code;
    }

    public void getBalance() {
        System.out.println(balance.toString());
    }

    public void deposit(BigDecimal amount) {
        try {
            if (balance.add(amount).compareTo(BigDecimal.valueOf(5000)) >= 0) {
                throw new TooMuchFundsException("Balance cant be more than $5000.00");
            } else {
                balance = balance.add(new BigDecimal(String.valueOf(amount)));
            }
        } catch (TooMuchFundsException e) {
            System.out.println("Warning: Too much money");
        }
    }

    public void withdrawal(BigDecimal amount) {
        try {
            if (this.balance.subtract(amount).compareTo(BigDecimal.valueOf(100)) < 0) {
                throw new NotEnoughFundsException("Balance cant be below $100.00");
            } else {
                balance = balance.subtract(amount);
            }
        } catch (NotEnoughFundsException e) {
            System.out.println("Warning: Low funds");
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", balance=" + balance +
                "} ";
    }
}

