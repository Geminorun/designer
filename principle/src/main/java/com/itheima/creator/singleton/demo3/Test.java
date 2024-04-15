package com.itheima.creator.singleton.demo3;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 11:11
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2==singleton1);
    }
}
