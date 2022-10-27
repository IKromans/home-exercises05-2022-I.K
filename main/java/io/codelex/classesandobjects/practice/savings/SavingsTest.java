package io.codelex.classesandobjects.practice.savings;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much money is in the account?: ");
        BigDecimal startMoney = input.nextBigDecimal();
        SavingsAccount mySavings = new SavingsAccount(startMoney);

        System.out.println("Enter the annual interest rate: ");
        BigDecimal rate = input.nextBigDecimal();
        mySavings.setAnnualInterestRate(rate);

        System.out.println("How long has the account been opened?: ");
        int months = input.nextInt();
        BigDecimal depositedSum = BigDecimal.ZERO;
        BigDecimal withrawSum = BigDecimal.ZERO;
        BigDecimal interestTotal = BigDecimal.ZERO;

        for (int i = 1; i <= months; i++) {
            System.out.println("Enter amount deposited for month: " + i + ": ");
            BigDecimal monthlyIn = input.nextBigDecimal();
            mySavings.deposit(monthlyIn);
            depositedSum = depositedSum.add(monthlyIn);

            System.out.println("Enter amount withdrawn for month: " + i + ": ");
            BigDecimal monthlyOut = input.nextBigDecimal();
            mySavings.withdraw(monthlyOut);
            withrawSum = withrawSum.add(monthlyOut);
            BigDecimal monthlyInterest = mySavings.monthlyInterest();
            interestTotal = interestTotal.add(monthlyInterest);
        }
        DecimalFormat df = new DecimalFormat("$#,###.00");
        System.out.println("Total deposited: " + df.format(new BigDecimal(String.valueOf(depositedSum))));
        System.out.println("Total withdrawn: " + df.format(new BigDecimal(String.valueOf(withrawSum))));
        System.out.println("Interest earned: " + df.format(new BigDecimal(String.valueOf(interestTotal))));
        System.out.println("Ending balance: " + df.format(new BigDecimal(String.valueOf(mySavings.balance))));
    }
}
