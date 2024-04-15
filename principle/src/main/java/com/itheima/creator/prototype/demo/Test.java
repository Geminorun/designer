package com.itheima.creator.prototype.demo;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 09:32
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println(realizetype);
        System.out.println(clone);
    }
}
