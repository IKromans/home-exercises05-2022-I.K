package io.codelex.java_advanced_test.exercise1;

public class DebitCard extends Card {

    private int balance;

    public DebitCard(String number, String name, String code) {
        super(number, name, code);
    }

    public void getBalance() {
        System.out.println(balance);
    }

    public void deposit(double amount) throws NotEnoughFundsException {
        if ((balance + amount) > 10000) {
            throw new NotEnoughFundsException("Warning: Too much money");
        } else {
            balance += amount;
        }
    }

    public void withdrawal(double amount) throws NotEnoughFundsException {
        if ((balance - amount) < 0) {
            throw new NotEnoughFundsException("Warning: Low funds");
        } else {
            balance -= amount;
        }
    }
}
