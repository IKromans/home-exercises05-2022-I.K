package io.codelex.java_advanced_test.exercise2;

public class BasketApp {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Mushroom mushroom = new Mushroom();
        Basket<Apple> appleBasket = new Basket<>(apple);
        Basket<Mushroom> mushroomBasket = new Basket<>(mushroom);
        Basket.addToBasket();
//        Basket.removeToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.addToBasket();
        Basket.removeToBasket();

    }
}
