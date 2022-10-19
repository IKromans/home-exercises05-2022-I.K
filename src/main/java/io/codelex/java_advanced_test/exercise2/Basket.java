package io.codelex.java_advanced_test.exercise2;

public class Basket<T> {

    private T content;

    private static int numberOfItems;

    public Basket(T content) {
        this.content = content;
    }

    public static void addToBasket() {
        if (Basket.numberOfItems == 10) {
            throw new BasketFullException("Basket is full!");
        } else {
            Basket.numberOfItems += 1;
        }
    }

    public static void removeToBasket() {
        if (Basket.numberOfItems == 0) {
            throw new BasketEmptyException("Basket is empty!");
        } else {
            Basket.numberOfItems -= 1;
        }
    }

    public T getContent() {
        return content;
    }
}
