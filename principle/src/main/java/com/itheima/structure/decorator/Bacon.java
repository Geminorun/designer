package com.itheima.structure.decorator;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 19:31
 * @Description:
 */
public class Bacon extends Garnish{


    public Bacon(FastFood fastFood) {
        super(fastFood,2,"培根");
    }

    @Override
    public float cost() {
        return getPrice()+ getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+ getFastFood().getDesc();
    }

    public String toString() {
        return "Bacon{}";
    }
}
