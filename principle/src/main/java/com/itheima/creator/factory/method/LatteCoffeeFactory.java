package com.itheima.creator.factory.method;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 19:24
 * @Description:
 */
public class LatteCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
