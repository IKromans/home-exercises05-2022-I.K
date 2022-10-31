package io.codelex.classesandobjects.practice;

public class Product {
    String name;
    double price;
    int amount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void setPriceAtStart(double price) {
        this.price = price;
    }

    public void setAmountAtStart(int amount) {
        this.amount = amount;
    }

    public void printProduct() {
        System.out.println(name + ", price " + String.format("%.2f", price) + " EUR, amount " + amount);
    }
}
