package com.itheima.creator.builder;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 19:44
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new MobileBuilder();
        Bike bike = builder.consturct();

        System.out.println(bike.getSeat());
        System.out.println(bike.getFrame());
    }
}
