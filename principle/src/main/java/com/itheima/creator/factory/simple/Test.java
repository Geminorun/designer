package com.itheima.creator.factory.simple;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 18:48
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        System.out.println(coffee.getName());
    }
}
