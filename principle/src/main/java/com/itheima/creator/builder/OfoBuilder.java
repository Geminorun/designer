package com.itheima.creator.builder;

/**
 * @Auther: lyl
 * @Date: 2024/1/25 19:40
 * @Description:
 */
public class OfoBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("OFO-钢架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("OFO-橡胶");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
