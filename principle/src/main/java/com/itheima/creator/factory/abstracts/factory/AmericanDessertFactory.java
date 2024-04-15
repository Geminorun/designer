package com.itheima.creator.factory.abstracts.factory;

import com.itheima.creator.factory.abstracts.AmericanCoffee;
import com.itheima.creator.factory.abstracts.Coffee;
import com.itheima.creator.factory.abstracts.Dessert;
import com.itheima.creator.factory.abstracts.MatchMousse;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 19:52
 * @Description:
 */
public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }
}
