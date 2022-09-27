package io.codelex.classesandobjects.practice.bankAccount;

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        if (balance < 0) {
            return "BankAccount{" + "name='" + name + '\'' +
                    ", balance=" + String.format("-$%.2f", Math.abs(balance)) +
                    '}';
        } else {
            return "BankAccount{" + "name='" + name + '\'' +
                    ", balance=" + String.format("$%.2f", balance) +
                    '}';
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
