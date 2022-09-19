package io.codelex.classesandobjects.practice;

public class ProductShop {
    public static void main(String[] args) {
        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);
        product2.setAmountAtStart(100);
        product3.setAmountAtStart(0);
        product1.setAmountAtStart(57);
        product2.setPriceAtStart(1099.99);
        product1.setPriceAtStart(59.99);
        product3.setPriceAtStart(562.00);
        product3.printProduct();
        product2.printProduct();
        product1.printProduct();
    }
}
