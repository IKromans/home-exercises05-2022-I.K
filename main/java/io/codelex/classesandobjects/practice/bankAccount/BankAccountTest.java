package io.codelex.classesandobjects.practice.bankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 17.25);
        System.out.println(benben.toString());
        double deposit = 10.01;
        benben.deposit(deposit);
        System.out.println(benben.toString());
        double withdraw = 47.56;
        benben.withdraw(withdraw);
        System.out.println(benben.toString());
    }
}
