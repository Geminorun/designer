package com.itheima.creator.factory.demo1;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 18:48
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        LatteCoffee latteCoffee = new LatteCoffee();
        CoffeeStore store = new CoffeeStore();
        store.make(latteCoffee);
    }
}
