package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    double totalSales;
    double commissionRate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double pay() {
        return super.pay() + totalSales * commissionRate;
    }
}
