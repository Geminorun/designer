package com.itheima.creator.factory.method;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 18:47
 * @Description:
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public CoffeeStore() {
    }

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }


    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }


    /**
     * 获取
     * @return factory
     */
    public CoffeeFactory getFactory() {
        return factory;
    }

    /**
     * 设置
     * @param factory
     */
    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public String toString() {
        return "CoffeeStore{factory = " + factory + "}";
    }
}
