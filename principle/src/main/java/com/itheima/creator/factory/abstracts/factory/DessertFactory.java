package com.itheima.creator.factory.abstracts.factory;

import com.itheima.creator.factory.abstracts.Coffee;
import com.itheima.creator.factory.abstracts.Dessert;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 19:52
 * @Description:
 */
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();

}
