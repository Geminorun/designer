package com.itheima.creator.factory.method;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 18:48
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        store.setFactory(new AmecicanCoffeeFactory());
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
