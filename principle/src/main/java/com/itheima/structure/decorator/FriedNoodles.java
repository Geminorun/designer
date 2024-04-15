package com.itheima.structure.decorator;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 19:26
 * @Description:
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }

    public String toString() {
        return "FriedMiddle{}";
    }
}
