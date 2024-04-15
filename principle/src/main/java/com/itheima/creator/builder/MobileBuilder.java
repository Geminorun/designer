package com.itheima.creator.builder;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 19:40
 * @Description:
 */
public class MobileBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("摩拜-炭纤维");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("陌拜-真皮");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
