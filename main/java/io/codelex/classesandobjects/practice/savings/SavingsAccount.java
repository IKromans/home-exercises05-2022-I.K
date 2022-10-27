package io.codelex.classesandobjects.practice.savings;

import java.math.BigDecimal;
import java.math.MathContext;

public class SavingsAccount {
    BigDecimal balance;
    BigDecimal annualInterestRate = BigDecimal.ZERO;

    public SavingsAccount(BigDecimal startBalance) {
        this.balance = startBalance;
    }

    public void withdraw(BigDecimal cashOut){
        balance = balance.subtract(cashOut);
    }

    public void deposit(BigDecimal cashIn){
        balance = balance.add(cashIn);
    }

    public BigDecimal monthlyInterest(){
        BigDecimal monthlyInterestRate = annualInterestRate.divide(BigDecimal.valueOf(12), MathContext.DECIMAL128);
        BigDecimal interest = monthlyInterestRate.multiply(balance);
        balance = balance.add(interest);
        return interest;
    }

    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
