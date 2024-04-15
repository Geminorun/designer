package com.itheima.creator.factory.simple;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 18:47
 * @Description:
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);

        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }


}
