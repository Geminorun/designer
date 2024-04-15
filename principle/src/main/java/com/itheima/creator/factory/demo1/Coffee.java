package com.itheima.creator.factory.demo1;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 18:43
 * @Description:
 */
public abstract class Coffee {
    public void  addSugar(){
        System.out.println("加糖");
    }
    public void  addMilk(){
        System.out.println("加奶");
    }
    public abstract String getName();
}
