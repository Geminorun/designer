package com.itheima.behavior.visitor;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 19:28
 * @Description:
 */
public class Someone implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("路人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("路人喂食狗");
    }
}
