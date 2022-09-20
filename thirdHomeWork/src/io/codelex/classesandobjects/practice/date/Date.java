package io.codelex.classesandobjects.practice.date;

public class Date {
    private int months;
    private int days;
    private int years;

    public Date(int months, int days, int years) {
        this.months = months;
        this.days = days;
        this.years = years;
    }

    public void setMonths(int months) {
        if (months >= 0 && months <= 12) {
            this.months = months;
        } else {
            this.months = 0;
        }
    }

    public void setDays(int days) {
        if (days > 0 && days <= 31) {
            this.days = days;
        } else {
            this.days = 0;
        }
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void displayDate() {
        System.out.println(months + "/" + days + "/" + years);
    }
}
