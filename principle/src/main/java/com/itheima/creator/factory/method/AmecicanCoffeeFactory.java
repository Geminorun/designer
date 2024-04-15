package com.itheima.creator.factory.method;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 19:24
 * @Description:
 */
public class AmecicanCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
