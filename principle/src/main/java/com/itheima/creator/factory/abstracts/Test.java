package com.itheima.creator.factory.abstracts;

import com.itheima.creator.factory.abstracts.factory.ItalyDessertFactory;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 19:55
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Coffee coffee = italyDessertFactory.createCoffee();
        Dessert dessert = italyDessertFactory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();

    }
}
