package com.itheima.creator.factory.abstracts.factory;

import com.itheima.creator.factory.abstracts.*;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 19:52
 * @Description:
 */
public class ItalyDessertFactory implements DessertFactory {
    
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
