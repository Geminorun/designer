package com.itheima.behavior.template;

/**
 * @Auther: lyl
 * @Date: 2024/1/30 18:56
 * @Description:
 */
public class ConcreateClass_Egg extends AbstractClass{

    @Override
    public void pourVegetable() {
        System.out.println("加鸡蛋");
    }

    @Override
    public void pourSauce() {
        System.out.println("加辣椒");
    }
}
