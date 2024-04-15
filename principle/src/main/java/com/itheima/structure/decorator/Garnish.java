package com.itheima.structure.decorator;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 19:28
 * @Description:
 */
public abstract class Garnish extends FastFood {
    private FastFood fastFood;


    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    /**
     * 获取
     * @return fastFood
     */
    public FastFood getFastFood() {
        return fastFood;
    }

    /**
     * 设置
     * @param fastFood
     */
    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public String toString() {
        return "Garnish{fastFood = " + fastFood + "}";
    }
}
