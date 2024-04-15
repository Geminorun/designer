package com.itheima.creator.singleton.demo6;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 11:37
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        System.out.println(singleton1==singleton2);
    }
}
