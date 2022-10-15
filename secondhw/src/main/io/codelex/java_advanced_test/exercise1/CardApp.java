package io.codelex.java_advanced_test.exercise1;

public class CardApp {
    public static void main(String[] args) throws NotEnoughFundsException {

        CreditCard creditCard = new CreditCard("0000-1111-2222-3333", "Homer Simpson", "980");
        DebitCard debitCard = new DebitCard("4444-5555-6666-7777", "Liza Simpson", "335");

        System.out.println("Credit card data:");
//        creditCard.toString();
        creditCard.deposit(2400);
        creditCard.getBalance();
        creditCard.withdrawal(3000);
        creditCard.getBalance();


        System.out.println("Debit card data:");
//        debitCard.toString();
        debitCard.deposit(500);
        debitCard.withdrawal(250);
        debitCard.deposit(9900);
        debitCard.getBalance();
    }
}
