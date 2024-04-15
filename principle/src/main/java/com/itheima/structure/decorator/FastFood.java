package com.itheima.structure.decorator;

/**
 * @Auther: lyl
 * @Date: 2024/1/29 19:22
 * @Description:
 */
public abstract class FastFood {

    private float price;
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public abstract float cost();

    /**
     * 获取
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 获取
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString() {
        return "FastFood{price = " + price + ", desc = " + desc + "}";
    }
}
