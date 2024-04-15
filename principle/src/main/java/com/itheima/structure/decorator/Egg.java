package com.itheima.structure.decorator;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 19:31
 * @Description:
 */
public class Egg extends Garnish{


    public Egg(FastFood fastFood) {
        super(fastFood,1,"鸡蛋");
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
        return "Egg{}";
    }
}
