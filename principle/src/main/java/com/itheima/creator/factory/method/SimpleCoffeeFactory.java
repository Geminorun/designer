package com.itheima.creator.factory.method;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 19:01
 * @Description:
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee=null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("没有对应的Coffee");
        }
        return coffee;
    }
}
