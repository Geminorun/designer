package com.itheima.creator.factory.demo1;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 18:47
 * @Description:
 */
public class CoffeeStore {

    public Coffee coffee;

    public void make(Coffee coffee){
        this.coffee = coffee;
        System.out.println(coffee.getName());
        coffee.addSugar();
        coffee.addMilk();
    }

    public CoffeeStore() {
    }

    public CoffeeStore(Coffee coffee) {
        this.coffee = coffee;
    }

    /**
     * 获取
     * @return coffee
     */
    public Coffee getCoffee() {
        return coffee;
    }

    /**
     * 设置
     * @param coffee
     */
    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public String toString() {
        return "CoffeeStore{coffee = " + coffee + "}";
    }
}
