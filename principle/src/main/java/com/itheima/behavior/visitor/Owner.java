package com.itheima.behavior.visitor;

/**
 * @Auther: lyl
 * @Date: 2024/2/26 19:28
 * @Description:
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
