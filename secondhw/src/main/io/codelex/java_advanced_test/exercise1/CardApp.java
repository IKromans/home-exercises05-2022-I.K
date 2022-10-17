package io.codelex.java_advanced_test.exercise1;

import java.math.BigDecimal;
import java.util.Random;

public class CardApp {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(BigDecimal.ZERO, getCardNumber(), "Homer Simpson", getCCVNumber());
        DebitCard debitCard = new DebitCard(BigDecimal.ZERO, getCardNumber(), "Lisa Simpson", getCCVNumber());
        System.out.println("Credit card data:");
        creditCard.deposit(BigDecimal.valueOf(20043.70));
        creditCard.getBalance();
        creditCard.deposit(BigDecimal.valueOf(132.20));
        creditCard.getBalance();
        creditCard.deposit(BigDecimal.valueOf(3394.55));
        creditCard.getBalance();
        creditCard.withdrawal(BigDecimal.valueOf(4000.00));
        creditCard.getBalance();
        System.out.println(creditCard.toString());

        System.out.println("\nDebit card data:");
        debitCard.deposit(BigDecimal.valueOf(6050.50));
        debitCard.getBalance();
        debitCard.deposit(BigDecimal.valueOf(550.60));
        debitCard.getBalance();
        debitCard.withdrawal(BigDecimal.valueOf(2435.20));
        debitCard.getBalance();
        debitCard.deposit(BigDecimal.valueOf(6050.50));
        debitCard.getBalance();
        System.out.println(debitCard.toString());

    }

    public static String getCardNumber() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 16; i++)
            if (i % 4 == 0 && i != 16) {
                sb.append((char) ('0' + rand.nextInt(10)));
                sb.append("-");
            } else {
                sb.append((char) ('0' + rand.nextInt(10)));
            }
        return sb.toString();
    }

    public static String getCCVNumber() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 3; i++)
            sb.append((char) ('0' + rand.nextInt(10)));
        return sb.toString();
    }
}
