package io.codelex.java_advanced_test.exercise1;

public class CreditCard extends Card {

    private int balance;


    public CreditCard(String number, String name, String code) {
        super(number, name, code);
    }

    public void deposit(double amount) throws NotEnoughFundsException {
        if ((balance + amount) > 5000) {
            throw new NotEnoughFundsException("Warning: Too much money");
        } else {
            balance += amount;
        }
    }

    public void getBalance() {
        System.out.println(balance);
    }

    public void withdrawal(double amount) throws NotEnoughFundsException {
        if ((balance - amount) < 100) {
            throw new NotEnoughFundsException("Warning: Low funds");
        } else {
            balance -= amount;
        }
    }
}

